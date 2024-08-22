package com.company;

import java.util.Scanner;

public class ArmStrongnumberPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();
        printArmStrongNo(first ,last);
    }

    private static void printArmStrongNo(int first, int last) {
        for (int i = first;i < last;i++) {
            int num = i;
            int sum = 0;
            while (num >0){
                int remainder = num%10;
                sum+=(remainder * remainder * remainder);
                num = num/10;
            }
            if(sum == i){
                System.out.println(sum);
            }

        }
    }
}
