package com.company;

import java.util.Scanner;

public class Cb_Number {
    static int [] arr = {2,3,5,7,11,13,17,19,23,29};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
         //String str = "6992239";

         boolean visited [] = new boolean[str.length()];

         int count =0;
         for(int len =1;len<=arr.length;len++){
             for(int si =0;si<=str.length()-len;si++){
                 int ei = len+si;
                 String st = str.substring(si,ei);

                 if(isVisited(visited,si,ei) && cbNumber(Long.parseLong(st))){
                     count++;
                 }
                 for(int i = si;i<ei;i++){
                     visited[i] = true;
                 }
             }
         }
        System.out.println(count);
    }
    public static boolean isVisited(boolean arr [],int si,int ei){
        for(int i =si; i<ei;i++){
            if(arr[i] == true){
                return false;
            }
        }
        return true;
    }
    public static boolean cbNumber(long n){
        //point 1
        if(n == 0 || n == 1){
            return false;
        }
        //point2
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                return true;
            }
        }
        //point 3
        for(int i=0;i<arr.length;i++){
            if(n%arr[i] == 0){
                return false;
            }
        }
        return true;

    }
}
