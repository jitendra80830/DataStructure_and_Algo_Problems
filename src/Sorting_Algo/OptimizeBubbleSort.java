package Sorting_Algo;

public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 2};
        optimizeBubbleSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }


    }

    public static void optimizeBubbleSort(int arr[]) {
        for (int pass = 1; pass <= arr.length - 1; pass++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            System.out.println(pass);
            if(flag == true){
                return;
            }
        }
    }
}
