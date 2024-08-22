package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Game_Strategy2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int coin[] = new int[n];
        for(int i =0;i<n;i++){
            coin[i] = sc.nextInt();
        }
        System.out.println(OptimalGameStrategy2(coin , 0 ,coin.length-1));
        int dp[][] = new int[coin.length][coin.length];

        for(int arr[] : dp){
            Arrays.fill(arr ,-1);
        }
        System.out.println(OptimalGameStrategy2TD(coin ,0 ,coin.length-1 ,dp));
    }
    public static int OptimalGameStrategy2(int coin[] ,int i ,int j){
        if(i>j){
            return 0;
        }

        int op1 = coin[i] + Math.min(OptimalGameStrategy2(coin ,i+2 ,j) , OptimalGameStrategy2(coin , i+1,j-1)); // if from 1st index picking  means modi ji picking
        int op2 = coin[j] + Math.min(OptimalGameStrategy2(coin ,i+1 ,j-1) , OptimalGameStrategy2(coin ,i ,j-2)); // if from last index picking  means modi ji picking

        return Math.max(op1 ,op2);
    }
    public static int OptimalGameStrategy2TD(int coin[] ,int i ,int j ,int dp[][]){
        if(i>j){
            return 0;
        }
        if(i+1 == j){
            return Math.max(coin[i] , coin[j]);
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int op1 = coin[i] + Math.min(OptimalGameStrategy2TD(coin ,i+2 ,j ,dp) , OptimalGameStrategy2TD(coin , i+1,j-1,dp)); // if from 1st index picking  means modi ji picking
        int op2 = coin[j] + Math.min(OptimalGameStrategy2TD(coin ,i+1 ,j-1,dp) , OptimalGameStrategy2TD(coin ,i ,j-2,dp)); // if from last index picking  means modi ji picking

        return dp[i][j] = Math.max(op1 ,op2);
    }
}
