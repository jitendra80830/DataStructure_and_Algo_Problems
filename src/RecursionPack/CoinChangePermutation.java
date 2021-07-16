package RecursionPack;

public class CoinChangePermutation {
    public static void main(String [] args){
        int [] coins = {2,3,5};
        int amount = 10;
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
