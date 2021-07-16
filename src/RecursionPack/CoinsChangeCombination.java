package RecursionPack;

public class CoinsChangeCombination {
    public static void main(String[] args){
        int [] coins = {2,3,5};
        int amount = 10;
        coinChangeCombination(coins,0,amount,"");
    }
    public static void coinChangeCombination(int coin [],int last_index , int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for(int i=last_index;i<coin.length;i++){
            if(amount>=coin[i]){
                coinChangeCombination(coin,i,amount-coin[i],ans+coin[i]);
            }
        }
    }
}
