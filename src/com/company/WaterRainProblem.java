package com.company;

public class WaterRainProblem {
    public static void main(String[] args){
        int arr[] = {3,0,0,2,4};
        System.out.print("Rain Water = "+waterRainProb(arr));

    }
    public static int waterRainProb(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int n = arr.length;
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1;i<left.length;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i = right.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int ans = 0;
        for(int  i =0;i<arr.length;i++){
            int water = Math.min(left[i],right[i]) - arr[i];
            ans=ans+water;
        }
        return ans;
    }
}
