package StringPack;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int count = 0;
        char ch[] = string.toCharArray();
        for (char c : ch) {
            count++;
        }
        System.out.println(count);
    }
}
