package StringPack;

import java.util.Scanner;

public class RemoveDuplicateCharToString {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeDuplicateChar(str);
    }

    //wrong
    private static void removeDuplicateChar(String str) {
        char ch[] = new char[str.length()];
        ch[0] = str.charAt(0); // insert 1st char in array
        for (int i = 1; i <str.length() ; i++) {
            char ch1 = str.charAt(i);
            for (int j = i; j <ch.length ; j++) {
                if (ch1 != ch[j]){
                    ch[i] = str.charAt(j);
                    break;
                }
            }
        }
        for (int i = 0; i < ch.length ; i++) {
            System.out.print(ch[i]+" ");

        }
    }
}
