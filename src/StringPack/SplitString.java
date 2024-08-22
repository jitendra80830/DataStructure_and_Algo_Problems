package StringPack;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i <str.length();i++) {
            if(str.charAt(i)==' ') { // whenever it found space it'll create separate words from string
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
