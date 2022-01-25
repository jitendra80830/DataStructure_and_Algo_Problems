package StringPack;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
    }

    private static void reverseString(String str) {
        int first =0;
        int last = str.length()-1;
        while (first < last){
            char ch = str.charAt(last);
          //  str.charAt(last) = str.charAt(first);
            //str.charAt(first) = ch;
        }
    }
}
