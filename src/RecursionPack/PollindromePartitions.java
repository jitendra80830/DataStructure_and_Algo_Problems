package RecursionPack;

import java.util.ArrayList;

public class PollindromePartitions {
    public static void main(String[] args){
        //partition("nitin","");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        partitionLeetCode("aab",list,ans);
        System.out.println(ans);
    }
    public static void partition(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i =1;i<=ques.length();i++){
            String roq = ques.substring(i); //rest of ques
            String roa = ques.substring(0,i); //rest of ans
            if(isPollindrome(roa)){
            partition(roq,ans+roa+" ");
            }
        }
    }
    public static boolean isPollindrome(String s){
        int i =0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void partitionLeetCode(String ques , ArrayList<String> list, ArrayList<ArrayList<String>> ans){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i =1;i<=ques.length();i++){
            String roq = ques.substring(i); //rest of ques
            String roa = ques.substring(0,i); //rest of ans

            if(isPollindrome(roa)){
                list.add(roa);
                partitionLeetCode(roq,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
}
