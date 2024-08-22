package com.company;

public class Maxvalue {
    public static  void main(String[] args){
        int arr[] = {1,3,44,22,88,98};
        System.out.println(maxFind(arr));

    }
    public  static int maxFind(int arr[]){
        int max = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return  arr[max];
    }
}
