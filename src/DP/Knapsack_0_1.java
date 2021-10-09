package DP;

import java.util.Arrays;

public class Knapsack_0_1 {
    public static void main(String[] args){
        int wt[] = {1,2,3,2,2};
        int cost[] = {8,4,0,5,3};
        int w =4;
        int dp[][] = new int[w+1][cost.length+1];
        for(int []arr :dp){
            Arrays.fill(arr ,-1);
        }
        System.out.println(knapSackProblem(wt ,cost ,1,w));
        System.out.println(knapSackProblemTD(wt,cost,1,w,dp));

    }
    public static int knapSackProblem(int[] wt , int [] cost ,int i,int w){
        if(i>=wt.length || w == 0){ // if i>=wt.len or w==0 then return 0;
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if(w >= wt[i-1]){ // if w(meas what i want to make that w)>=wt[i-1] then go call for inclusion otherwise call for exclusion
            inc+= cost[i-1] + knapSackProblem(wt ,cost ,i+1 ,w-wt[i-1]); // here i increamenting index
        }
        exc+=knapSackProblem(wt ,cost ,i+1,w);
        return Math.max(inc ,exc);
    }
    public static int knapSackProblemTD(int[] wt , int [] cost ,int i,int w,int dp[][]){
        if(i>=wt.length || w == 0){
            return 0;
        }
        int inc = 0;
        int exc = 0;

        if(dp[w][i]!=-1){ // if dp[w][i] not equal to -1 means there is some values present then return
            return dp[w][i];
        }
        if(w >= wt[i-1]){ // if w(meas what i want to make that w)>=wt[i-1] then go call for inclusion otherwise call for exclusion
            inc+= cost[i-1] + knapSackProblemTD(wt ,cost ,i+1 ,w-wt[i-1] ,dp);
        }
        exc+=knapSackProblemTD(wt ,cost ,i+1,w ,dp);
        return dp[w][i] = Math.max(inc ,exc);
    }
}
