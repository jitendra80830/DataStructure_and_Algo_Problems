package com.company;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1,2,5,7,9,11,13,15,18};
        System.out.println(binarySearch(arr,15));

    }
    public static int binarySearch(int arr[],int item){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(item == arr[mid]){
                return mid;
            }else  if(arr[mid]>item){
                high = mid-1;
            }else
                low = mid+1;
        }
        return -1;
    }
}
