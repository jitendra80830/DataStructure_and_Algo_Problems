package Opps2;

import java.util.ArrayList;

public class Generic_Demo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println(list);

        Integer [] arr = {1,2,3,4,5,5,6,7};

        String [] arr1 = {"a","c","j","ram"};
        //display(arr);
        //display(arr1);

        Cars [] car = new Cars[5];

        car[0] = new Cars(200 , 28 , "blue");
        car[1] = new Cars(300 , 38 , "black");
        car[2] = new Cars(400 , 48 , "red");
        car[3] = new Cars(500 , 58 , "white");
        car[4] = new Cars(600 , 68 , "green");
        display(car);
    }
    public static <T>void display(T [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        //System.out.println();
    }

}
