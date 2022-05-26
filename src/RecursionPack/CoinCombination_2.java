package RecursionPack;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;

public class CoinCombination_2 {
    public static void main(String[] args){
        int coin[] = {1,2,7,6,1,5};
        Arrays.sort(coin);
        int amount = 8;
        //coinCombination_2(coin,0,amount,"");


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        coinCombination_2_Use2D(coin,0,amount,list,ans);
        System.out.println(ans);

    }
    public static void coinCombination_2(int coin [],int last_index,int amount,String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for(int i= last_index;i<coin.length;i++){
            if(i!=last_index && coin[i]==coin[i-1])
                continue;
            if(amount>=coin[i]) {
                coinCombination_2(coin, i + 1, amount - coin[i], ans + coin[i]);
            }
        }
    }
    public static void coinCombination_2_Use2D(int coin [], int last_index, int amount, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(amount == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i= last_index;i<coin.length;i++){
            if(i!=last_index && coin[i]==coin[i-1])
                continue;
            if(amount>=coin[i]) {
                list.add(coin[i]);

                coinCombination_2_Use2D(coin, i + 1, amount - coin[i], list,ans);
                list.remove(list.size()-1);
            }
        }
    }
}
