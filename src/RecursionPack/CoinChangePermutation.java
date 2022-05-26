package RecursionPack;

public class CoinChangePermutation {
    public static void main(String [] args){
        int [] coins = {1,2,3,4,5};
        int amount = 4;
        coinsChangePermutation(coins,amount,"");
    }
    public static void coinsChangePermutation(int [] coins, int amount, String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<coins.length;i++){

            if(amount>=coins[i]) {
                coinsChangePermutation(coins, amount - coins[i], ans+coins[i]);
            }
        }

    }
}
