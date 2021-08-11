package StackPck;

import java.util.Scanner;

public class MinStackClient {
    public static void main(String[] args) throws Exception {
        MinStack ms = new MinStack();
        ms.push(10);
        ms.push(50);
        ms.push(5);
        ms.push(60);
        ms.push(7);
        ms.push(40);
        ms.push(3);

        System.out.println(ms.min());
        System.out.println(ms.pop());
        System.out.println(ms.min());

    }
}
