package Sorting_Algo;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {7,4,9,1,2};
        selection_Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_Sort(int arr[]){
        for(int counter = 0;counter<arr.length;counter++){
            int min = counter;
            for(int i = counter+1;i<arr.length;i++){
                if(arr[i] < arr[min]){
                   min = i;
                }
            }
            //swap
            int temp = arr[counter];
            arr[counter] = arr[min];
            arr[min]= temp;

        }
    }
}
