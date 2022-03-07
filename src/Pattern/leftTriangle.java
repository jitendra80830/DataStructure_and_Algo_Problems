package Pattern;

import java.util.Scanner;

public class leftTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        leftPattern(n);
    }
    public static void leftPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
}
