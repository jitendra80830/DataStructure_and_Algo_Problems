package Arary_2D;

import java.util.Scanner;

public class TakeInput2D {
    public static void main(String[] args){
        int arr[][] = takeInput();
        printArray(arr);

    }
    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);
        int row  = input.nextInt();
        int col = input.nextInt();
        int [][] arr = new int[row][col];
        for (int i=0;i<arr.length;i++){

            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;

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
