package RecursionPack;

import java.util.ArrayList;

public class CombinationNimber {
    public static void main(String[] args){
        int n =4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int tq = 2;
        Combination(n,0,tq,0,list,ans);
        System.out.println(ans);

    }
    public static void Combination(int n, int last_index, int tq, int qpsf, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(tq == qpsf){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i =last_index+1;i<=n;i++){
                list.add(i);
                Combination(n,i,tq,qpsf+1,list,ans);

                list.remove(list.size()-1);
            }
        }
    }
