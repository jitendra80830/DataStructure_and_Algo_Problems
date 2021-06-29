package Arary_2D;

import java.util.Scanner;

public class SearchArray2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[][] =   {{1,3,5,7},
                        {10,11,16,20}
                        ,{23,30,34,60}};
        System.out.println("Enter a element which you want to search");
        int target = sc.nextInt();
        System.out.println(Search(arr,target));
    }
    public static boolean Search(int arr[][] , int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return true;
            }if(arr[row][col]>target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
