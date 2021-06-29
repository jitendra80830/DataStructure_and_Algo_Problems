package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Takeinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter no of Elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){

            list.add(sc.nextInt());

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
