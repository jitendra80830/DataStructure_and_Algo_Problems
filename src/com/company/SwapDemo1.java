package com.company;

public class SwapDemo1 {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1,23,5,6,55};
        int other[] = {5,6,71,44};
        System.out.println(arr[0]+" , "+other[0]);
        //swap1(arr[0],arr[1]); //not swap
        //swap2(arr,0,1); //swap hoga
        //swap3(arr[0],arr[1]); //nhi hoga

        swap4(arr,other); //here nhi hoga

        System.out.println(arr[0]+" , "+other[0]);

    }
    public static void swap1(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

    }
    public  static  void swap2(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }
    public  static void  swap3(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public  static  void swap4(int[] arr,int[] other){
        int temp[] = arr;
        arr = other;
        other = temp;
        System.out.println(arr[0]+" , "+other[0]); //till here hoga swap

    }

}
