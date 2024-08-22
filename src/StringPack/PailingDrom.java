package StringPack;

import java.util.Scanner;

public class PailingDrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println(isPolidrome(str));
    }

    public static boolean isPolidrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
