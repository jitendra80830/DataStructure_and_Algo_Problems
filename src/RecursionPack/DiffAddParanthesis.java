package RecursionPack;

import java.util.ArrayList;

public class DiffAddParanthesis {
    public static void main(String[] args){
        ArrayList<Integer> list = diffWayAddParanthesis("2*3-4*5");
        System.out.println(list);

    }
    public static ArrayList<Integer> diffWayAddParanthesis(String str){
        if(str.indexOf('+')==-1 && str.indexOf('-')==-1 && str.indexOf('*')==-1){
            ArrayList<Integer> bs = new ArrayList<>();
            bs.add(Integer.parseInt(str));
            return bs;

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '+' || ch=='-'|| ch=='*'){
                ArrayList<Integer> left = diffWayAddParanthesis(str.substring(0,i));
                ArrayList<Integer> right = diffWayAddParanthesis(str.substring(i+1));

                for(int val : left){
                    for(int val1 : right){
                        if(ch == '+'){
                            ans.add(val+val1);
                        }if(ch == '-'){
                            ans.add(val-val1);
                        }if(ch == '*'){
                            ans.add(val*val1);
                        }

                    }
                }
            }
        }
        return ans;
    }
}
