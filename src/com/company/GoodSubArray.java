package com.company;

public class GoodSubArray {
    public static void main(String[] args){

        int arr[] = {1,3,2,6,4};
        System.out.println(goodSubArray(arr,arr.length));
    }
    public static int goodSubArray(int arr[] , int n){
        int hole[] = new int[n];
        hole[0] = 1;
        int sum = 0;
        for(int i =0;i<hole.length;i++){

            sum += arr[i];
            if(sum<n){
                sum%=n;
                sum+=n;
            }
            sum %= n;
            hole[sum]++;
        }
        int ans = 0;
        for(int i=0;i<hole.length;i++){

            if(hole[i]>=2){
                int p = hole[i];
                ans = ans + (p*(p-1))/2;

            }
        }
        return ans;
    }
}
