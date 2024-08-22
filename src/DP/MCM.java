package DP;

import java.util.Arrays;

//Matrix Chain Multiplication
public class MCM {
    public static void main(String[] args){
        int arr[] = {4,2,3,5,1};
        System.out.println(matrix_Chain_Multiplication(arr ,0 ,arr.length-1));
        int dp [][] = new int[arr.length][arr.length];
        for (int arr1[] : dp ){
            Arrays.fill(arr1 ,-1);
        }
        System.out.println(matrix_Chain_MultiplicationTD(arr ,0 ,arr.length-1,dp));

    }
    public static int matrix_Chain_Multiplication(int arr[] , int si ,int ei){
        if(si+1 ==ei){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k =si+1;k<ei;k++){
            int fp = matrix_Chain_Multiplication(arr , si , k); // from si to k calls(first part)
            int sp = matrix_Chain_Multiplication(arr ,k , ei); //from k to ei calls (second part)
            int self = arr[si]*arr[k]*arr[ei]; //at self working like (0,1)(1,4) = 4*2 ,2*1 = 4*2*1 = 8
            ans = Math.min(ans , self+fp+sp);// find min
        }
        return ans;
    }
    public static int matrix_Chain_MultiplicationTD(int arr[] , int si ,int ei ,int dp[][]){
        if(si+1 ==ei){
            return 0;
        }
        if (dp[si][ei]!=-1){
            return dp[si][ei];
        }
        int ans = Integer.MAX_VALUE;
        for(int k =si+1;k<ei;k++){
            int fp = matrix_Chain_MultiplicationTD(arr , si , k,dp); // from si to k calls(first part)
            int sp = matrix_Chain_MultiplicationTD(arr ,k , ei,dp); //from k to ei calls (second part)
            int self = arr[si]*arr[k]*arr[ei]; //at self working like (0,1)(1,4) = 4*2 ,2*1 = 4*2*1 = 8
            ans = Math.min(ans , self+fp+sp);// find min
        }
        return dp[si][ei] = ans;
    }

}
//https://leetcode.com/problems/minimum-score-triangulation-of-polygon/submissions/
