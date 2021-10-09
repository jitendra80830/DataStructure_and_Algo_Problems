package DP;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args){
        int arr[] ={10,9,2,5,3,7,101,18};
        System.out.println(LIC(arr));
        System.out.println(LIC2(-1 ,0 ,arr));

    }
    public static int LIC(int arr[]){
        int n = arr.length;//arr ka length
        int dp[] = new int[n];
        Arrays.fill(dp ,1);// fill 1 on all index of dp
        for(int i =1;i<dp.length;i++){ // loop i from 1 on arr
            for(int j=0;j<i;j++){ //loop j from 0 til i
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[j] + 1,dp[i] );// if arr[j]<arr[i] then dp[i] pe max of dp[j]+1,dp[i] dall dena hai okk
                }
            }
        }
        Arrays.sort(dp); // after than sort the dp and length-1 values return kr do
        return dp[dp.length-1];
    }
    public static int LIC2(int prev ,int curr ,int arr[]){ //prev =-1 ,curr=1
        if(curr == arr.length){
            return 0;
        }

        int r1 = 0;
        if(prev == -1 || arr[prev] < arr[curr]){
            r1 = 1 + LIC2(curr , curr+1 ,arr);
        }
        int r2 =LIC2(prev ,curr+1 ,arr);

        return Math.max(r1 ,r2);
    }
}
