package com.company;

public class LinearSearch {
    public  static  void main(String[] args){
        int arr[] = {22,3,1,21,44,11,56};
        int item = 21;
        System.out.println(linearSearch(arr,item));
    }
    public static int linearSearch(int arr[], int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
}
