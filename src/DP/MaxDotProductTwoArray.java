package DP;

import Arraylist.Array_Two_Sum;

import java.util.Arrays;

public class MaxDotProductTwoArray {
    public static void main(String[] args){
        int []arr1 = {3,-2};
        int arr2[] = {2,-6,7};
        System.out.println(max_dot_otProductTwoArray(arr1,arr2,0,0,false));
        int dp[][] = new int[arr1.length+1][arr2.length+1];
        for (int []arr : dp){
            Arrays.fill(arr,-10000000);
        }
        System.out.println(max_dot_otProductTwoArrayTD(arr1 ,arr2 ,0 ,0,dp,false));

    }
    public static int max_dot_otProductTwoArray(int arr1[] , int arr2[] ,int i ,int j ,boolean taken){
        if(i==arr1.length || j == arr2.length){
            if(taken) {
                return 0;
            }else {
                return -10000000;
            }
        }

        int dot_Product = arr1[i] * arr2[j]  + max_dot_otProductTwoArray(arr1 ,arr2 ,i+1 ,j+1 ,true);
        int f_del = max_dot_otProductTwoArray(arr1 ,arr2 ,i+1 ,j,false);
        int s_del = max_dot_otProductTwoArray(arr1 ,arr2 ,i ,j+1,false);

        return Math.max(arr1[i]*arr2[j] ,Math.max(dot_Product , Math.max(f_del ,s_del)));


    }
    public static int max_dot_otProductTwoArrayTD(int arr1[] , int arr2[] ,int i ,int j ,int dp[][] ,boolean taken){
        if(i==arr1.length || j == arr2.length){
            if(taken) {
                return 0;
            }else {
                return -10000000;
            }
        }
        if(dp[i][j]!=-10000000){
            return dp[i][j];
        }
        int dot_Product = arr1[i] * arr2[j]  + max_dot_otProductTwoArrayTD(arr1 ,arr2 ,i+1 ,j+1 , dp , true);
        int f_del = max_dot_otProductTwoArrayTD(arr1 ,arr2 ,i+1 ,j,dp ,false);
        int s_del = max_dot_otProductTwoArrayTD(arr1 ,arr2 ,i ,j+1 ,dp ,false);

        return dp[i][j] = Math.max(arr1[i]*arr2[j] , Math.max(dot_Product , Math.max(f_del ,s_del)));


    }
}
