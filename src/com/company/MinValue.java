package com.company;

public class MinValue {
    public  static  void main(String[] args){
        int arr[] = {1,3,44,22,88,98};
        System.out.println(minFind(arr));
    }
    public  static int minFind(int arr[]){
        int min = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return  arr[min];
    }
}
