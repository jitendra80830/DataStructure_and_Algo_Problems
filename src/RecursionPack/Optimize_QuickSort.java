package RecursionPack;

import java.util.Random;

public class Optimize_QuickSort {
    public static void main(String[] args){
        int arr[] = {2,7,5,6,1,4};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void quickSort(int arr[] , int si , int ei){
        if(si>ei){
            return;
        }

        int pi = partition(arr,si , ei);
        quickSort(arr,si , pi-1);
        quickSort(arr,pi+1,ei);

    }
    public static int partition(int arr[] , int si , int ei){
        Random rn = new Random();
        int idx = rn.nextInt(ei-si)+si;
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] =temp;


        int pivot = arr[ei];
        int pi = si;
        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                int temp1 = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp1;
                pi++;

            }
        }
        int temp1 = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] =temp1;
        return pi;

    }
}
