package com.company;

import java.util.Random;

public class Random_Demo {
    public static void main(String[] args){
        Random rn = new Random();
        int low = 0;
        int high = 100;
        randomNumber(low,high);

    }
    public static void randomNumber(int si , int ei){
        Random rn = new Random();
        for(int i=1;i<=10;i++){
            int num = rn.nextInt(ei-si)+si;
            System.out.print(num+" ");
        }
    }
}
