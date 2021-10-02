package Questions;

import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2= sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int sum[] = new int[n1 > n2? n1 : n2];
    }
    public static void sumOfTwoArrays(int arr1[] , int []arr2){

    }
}
