package Sorting_Algo;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {11,4,25,6,7};
        insertionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int counter =1;counter<arr.length;counter++){
            int item = arr[counter];
            int j = counter-1;
            while(j>=0 && arr[j]>item){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;

        }

    }
}
