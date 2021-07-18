package RecursionPack;

import java.util.ArrayList;

public class Combination_Sum111 {
    public static void main(String[] args){
        int n = 7;
        int tq = 3;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinationSum111(n,0,0,tq,0,list,ans);
        System.out.println(ans);


    }
    public static void combinationSum111(int n, int last_idex, int sum ,int tq,int qpsf, ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ans){
        if(tq == qpsf && sum == n){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>n){
            return;
        }

        for(int i=last_idex+1;i<=9;i++){

                sum =i+1;
                list.add(sum);
                combinationSum111(n,i,sum,tq,qpsf+1,list,ans);
                list.remove(list.size()-1);


        }
    }
}
