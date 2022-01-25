package StringPack;

import java.awt.*;
import java.util.Scanner;

public class PrintNUmber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println(string.replaceAll( "[0-9]" , ""));
        System.out.println(string.replaceAll( "[^0-9]" , ""));
    }
}
