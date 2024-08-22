package DP;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Min_CostClimbing_Stairs {
    public static void main(String[] args){
        int cost[] = {10 ,15,20};
        System.out.println(costClimbing(cost ,0));
        int dp[] = new int[cost.length+1];
        Arrays.fill(dp,-1);
        System.out.println(costClimbingTD(cost ,0 ,dp));
        System.out.println(minCostClimb(cost));

    }
    public static int costClimbing(int [] cost , int i){
        int first = helper(cost , 0); // for index 0
        int second = helper(cost , 1);// for index 1
        return Math.min(first ,second); // mim of these

    }

    private static int helper(int[] cost, int i) {
        if(i>=cost.length){ //base base
            return 0;
        }

        int first = helper(cost ,i+1); //one step
        int second = helper(cost , i+2);//two step

        return cost[i] + Math.min(second ,first); //return arr[i]+min(s,f)
    }
    public static int costClimbingTD(int [] cost , int i ,int []dp){
        int first = helperTD(cost , 0 ,dp); // for index 0
        int second = helperTD(cost , 1 ,dp);// for index 1
        return Math.min(first ,second); // mim of these

    }

    private static int helperTD(int[] cost, int i ,int []dp) {
        if(i>=cost.length){ //base base
            return 0;
        }

        if(dp[i]!=-1){ // if not 1000000 mean already exits values then return
            return dp[i];
        }
        int first = helperTD(cost ,i+1 ,dp); //one step
        int second = helperTD(cost , i+2 ,dp);//two step

        dp[i] = cost[i] + Math.min(second ,first); //store in  dp[i]+min(s,f)
        return dp[i];
    }
   public static int minCostClimb(int arr[]){
        int []dp = new int[arr.length+1];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for(int i=2;i<arr.length;i++) {
            dp[i] = arr[i] + Math.min(dp[i-2] , dp[i-1]);
        }
        return Math.min(dp[arr.length-1] , dp[arr.length-2]);
    }
}
