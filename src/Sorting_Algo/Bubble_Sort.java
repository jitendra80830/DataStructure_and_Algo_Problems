package Sorting_Algo;

public class Bubble_Sort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        bubble_sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble_sort(int arr[]){

        for(int pass = 1;pass<=arr.length-1;pass++){
            for(int j=0;j<arr.length-pass;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
