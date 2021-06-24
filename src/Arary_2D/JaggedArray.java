package Arary_2D;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] arg){

        int jagged[][] = takeinput_jagged();
        printArray(jagged);


        int [][]arr = new int[4][];
        //System.out.println(arr);
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //System.out.println(arr[3]);
        for(int i=0;i< arr.length;i++){
            arr[i] = new int[i+2];
        }
        //System.out.println(arr);
        //System.out.println(arr[0]);
       // System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //System.out.println(arr[3]);
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                //System.out.print(arr[i][i]+" ");

            }
            //System.out.println();
        }

    }
    public static int[][] takeinput_jagged(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int [][]jagged = new int[row][];
        for(int i=0;i<jagged.length;i++){
            int col = sc.nextInt();
            jagged[i] = new int[col];
            for (int j=0;j<jagged[i].length;j++){
                jagged[i][j] = sc.nextInt();
            }
        }
        return jagged;
    }
    public static void printArray(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
