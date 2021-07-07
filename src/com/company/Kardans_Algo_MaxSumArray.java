package com.company;

public class Kardans_Algo_MaxSumArray {
    public static void main(String[] args){
        int [] arr = {-2,-3,-5,-8,-6,-1,0};
        System.out.println(maxSumArrays(arr));

    }
    public static int maxSumArrays(int [] arr){
        int curr_sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            maxSum = Math.max(maxSum,curr_sum);

            //maxSum = curr_sum;
            if(curr_sum<0){
                curr_sum = 0;
            }
        }
        return maxSum;
    }
}
