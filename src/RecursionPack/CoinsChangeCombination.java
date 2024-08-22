package RecursionPack;

import java.util.ArrayList;

public class CoinsChangeCombination {
    public static void main(String[] args){
        int [] coins = {1,2,3,4,5};
        int amount = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        coinChangeCombination(coins,0,amount,list,ans);
        System.out.println(ans);
    }
    public static void coinChangeCombination(int coin [], int last_index , int amount, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=last_index;i<coin.length;i++){
            if(amount>=coin[i]){
                list.add(coin[i]);
                coinChangeCombination(coin,i,amount-coin[i],list,ans);
                list.remove(list.size()-1);
            }
        }
    }

}
