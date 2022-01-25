package com.company;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k =n;
        int sum = 0;

        while(k!=0){
            int a = k%10;
            int p = pow(a,3);
            sum+=p;
            k = k/10;

        }
        System.out.println(sum);

    }

    public static int pow(int a,int b){
        if(b == 0){
            return 1;
        }

        return a*pow(a,b-1);
    }

}
