package Opps2;

import java.util.ArrayList;
import java.util.Arrays;

public class Generic_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println(list);

        Integer[] arr = {1, 2, 3, 4, 5, 5, 6, 7};

        String[] arr1 = {"a", "c", "j", "ram"};
        //display(arr);
        //display(arr1);


        Cars[] car = new Cars[5];


        car[0] = new Cars(200, 28, "blue");
        car[1] = new Cars(543, 58, "black");
        car[2] = new Cars(430, 48, "red");
        car[3] = new Cars(900, 98, "white");
        car[4] = new Cars(600, 68, "green");
        display(car);
        // Arrays.sort(car);
        System.out.println(" ----------------------->");
        bubble_sort(car , new CarPriceComparator());
        display(car);
    }

    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        //System.out.println();
    }

    //    public static <T extends Comparable<T>>void bubble_sort(T [] arr){
//
//        for(int pass = 1;pass<=arr.length-1;pass++){
//            for(int j=0;j<arr.length-pass;j++){
//                if(arr[j].compareTo(arr[j+1])>0){
//                    T temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//    }
    public static  void bubble_sort(Cars [] arr , CarPriceComparator camp) {

        for (int pass = 1; pass <= arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - pass; j++) {
                if (camp.compare(arr[j] , arr[j+1])>0) {
                    Cars temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
