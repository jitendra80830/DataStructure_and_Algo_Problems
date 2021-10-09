package DP;

import java.util.Arrays;

public class ConsChange2 {
    public static void main(String[] args){
        int coins[] = {1,2,5};
        int amount =5;
        System.out.println(coinChange2(coins ,amount ,coins.length));
        int dp[][] = new int[amount+1][coins.length+1];
        for(int [] arr : dp){
            Arrays.fill(arr ,-1); //fill -1 on arrays
        }
        System.out.println(coinChange2TD(coins , amount ,coins.length ,dp));

    }
    public static int coinChange2(int coin[] , int amount , int i){
        //base case
        if(amount == 0){ //if amount ==0 then return 1;
            return 1;
        }
        if(i ==0){ // if i ==0 then return 0
            return 0;
        }
        int inc = 0; //inclusion
        int exc =0; // exclusion

        if(amount >= coin[i-1]){
            inc+= coinChange2(coin , amount - coin[i -1] , i);

        }
        exc+= coinChange2(coin , amount  ,i-1);
        return inc+exc;
    }
    public static int coinChange2TD(int coin[] , int amount , int i ,int dp[][]){
        //base case
        if(amount == 0){ //if amount ==0 then return 1;
            return 1;
        }
        if(i ==0){ // if i ==0 then return 0
            return 0;
        }
        if(dp[amount][i]!=-1){ //if not -1 that means these is present some values then return dp
            return dp[amount][i];
        }
        int inc = 0; //inclusion
        int exc =0; // exclusion

        if(amount >= coin[i-1]){ // if amount > coin[i-1] then call for inclusion(means picking amount here)
            inc+= coinChange2TD(coin , amount - coin[i -1] , i ,dp);

        }
        exc+= coinChange2TD(coin , amount  ,i-1 ,dp);// if amount not greater than coin[i-1] then call for exclusion(means not picking amount here)
        return dp[amount][i] = inc+exc; // first store then returning ok
    }
    public static int coinChange2BU(int coin[] , int amount){
        int dp[][]  = new int[amount+1][coin.length+1];
        for(int i =0;i<coin.length;i++){ // if amount==0 then fill in all row  1
            dp[0][i] = 1;
        }
        dp[0][0] =0;// if coins is 0 then fill in all colmn 0,here filling d[0][0] because in all col already fill 0

        for(int ammount =1;ammount<amount;ammount++){
            for(int idx=1;idx<coin.length;idx++){
                int inc = 0; //inclusion
                int exc =0; // exclusion
                if (ammount >=coin[idx-1]){ // if amount>=idx-1 index then
                    inc+=dp[ammount - coin[idx-1]][idx];
                }
                exc+= dp[ammount][idx-1];
                dp[ammount][idx]=inc+exc;

            }
        }
        return dp[amount][coin.length];

    }
}
