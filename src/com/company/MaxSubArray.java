package com.company;

public class MaxSubArray {
    public static void main(String[] args){
        int arr[] = {-3,4,-1,5,-7};
        System.out.println(maxSubArray(arr));

    }
    public static int  maxSubArray(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr_sum = 0;
            for(int j = i;j<arr.length;j++){
                curr_sum+=arr[j];
                max_sum = Math.max(max_sum,curr_sum);
            }
        }
        return max_sum;
    }
}
