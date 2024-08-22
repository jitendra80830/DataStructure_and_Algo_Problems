package DP;

import java.util.Arrays;

public class Distrinct_Subsequence {
    public static void main(String[] args){
        String s  = "rabbbit";
        String t = "rabbit";
        int dp[][] = new int[t.length()+1][s.length()+1];
        for(int [] arr : dp){
            Arrays.fill(arr ,-1); //fill -1 on arrays
        }
        System.out.println(distinc_subsequinceTD(s,t ,s.length() ,t.length() ,dp));

    }
    // n for t'len
    //m for s'len
    public static int distinc_subsequinceTD(String s , String t , int m ,int n ,int dp[][]){
        //base case
        if(n== 0){ //if n ==0 then return 1;
            return 1;
        }
        if(m ==0){ // if m ==0 then return 0
            return 0;
        }
        if(dp[n][m] != -1){ //if not -1 that means these is present some values then return dp
            return dp[n][m];
        }
        int inc = 0; //inclusion
        int exc =0; // exclusion

        if(s.charAt(m-1)==t.charAt(n-1)){ // if char of s is equal to char of t then call for inclusion(means char is equal here)
            inc+= distinc_subsequinceTD(s , t , m-1 , n-1,dp);

        }
        exc+= distinc_subsequinceTD(s, t  ,m-1 ,n,dp);// if t not matching with s's char then not  then call for exclusion
        return dp[n][m] = inc+exc; // first store then returning ok
    }
}
