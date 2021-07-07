package com.company;

public class CirculrMaxSubArray {
    public static void main(String[] args){
        int [] arr = {2,3,-8,100,-4,6,7};
        System.out.println(circleMaxSubArray(arr));

    }
    public static int circleMaxSubArray(int [] arr){

        int kardans_sum = kardanalseAlgo(arr); //109
        int totalSum =0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];//106
            arr[i] = -1*arr[i]; //for 8
        }
        totalSum+=kardanalseAlgo(arr); //106+8=114 ans
        return Math.max(kardans_sum , totalSum); //114

    }

    public static int kardanalseAlgo(int [] arr){
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
