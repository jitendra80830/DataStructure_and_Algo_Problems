package Pattern;

import java.util.Scanner;

public class leftpattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
//        int arr[][] = new int[m][m];
//        for (int i =0 ;i<m;i++){
//            for (int j = 0; j <m ; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
        //leftopps(m);
        //leftPattern(m);
        //combination_left_opssleft(m);
        rightPattern(m);
    }

    private static void leftopps(int m) {
        for (int i = 0; i <m; i++) {
            for (int j = m-1; j>=i ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void leftPattern(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0;j<=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void combination_left_opssleft(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0;j<=i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
        for (int i = 0; i <n; i++) {
            for (int j = n-2; j>=i ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public static void rightPattern(int n){
        for (int i = 1; i <n ; i++) {
            for (int j = n-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
                
            }
            System.out.println();

        }
    }

}
