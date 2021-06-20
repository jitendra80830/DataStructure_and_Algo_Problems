package com.company;

public class ProductOfArray {
    public static void main(String[] args){
        int arr[] = {4,5,6,3};
        int ans[] = productOf_Array1(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] productOf_Array(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = 1;
        for(int i = 1;i<left.length;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        right[right.length-1]=1;
        for(int j = right.length-2;j>=0;j--){
            right[j] =right[j+1] * arr[j+1];
        }
        for(int k =0;k<arr.length;k++){
            right[k] = right[k] * left[k];
        }
        return right;

    }
    //Optimize
    public static int[] productOf_Array1(int arr[]){
        int left[] = new int[arr.length];
        //int right[] = new int[arr.length];
        left[0] = 1;
        for(int i = 1;i<left.length;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        int r = 1;
        for(int k =left.length-1;k>=0;k--){
            left[k] = left[k] * r;
            r*=arr[k];
        }
        return left;

    }
}
