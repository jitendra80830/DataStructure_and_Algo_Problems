package StringPack;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
    }

    private static void reverseString(String str) {
        char ch[] = str.toCharArray();
        int last = str.length()-1;
        int half = str.length() /2;
        for (int i = 0; i <half ; i++) {
            char temp = ch[i];
            ch[i] = ch[last - i];
            ch[last -i] = temp;
        }
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]);

        }

    }
}
