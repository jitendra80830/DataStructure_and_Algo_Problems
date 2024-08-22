package Arary_2D;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        diogonalTraverse(arr);
    }

    private static void diogonalTraverse(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int d = 0; d < row+col -1 ; d++) { //for loop for no of diagonal
            int r = 0;
            int c =0;
            if(d < col){ // jab diagonal less than col len se hai tab
                r = 0;
                c = d;
            }else {
                r = d - (arr[0].length - 1);
                c = arr[0].length - 1;
            }
            ArrayList<Integer> temp = new ArrayList<>();
            while (r <row && c >=0) {
                temp.add(arr[r][c]);
                r++;
                c--;
            }
                if(d%2 ==0){
                    for (int i = temp.size()-1; i >=0 ; i--) { // if diagonal is even then reverse and add in the list from temp array
                        list.add(temp.get(i));

                    }
                }else {
                    for (int i = 0; i <temp.size(); i++) { // if diagonal is odd then  add in the list from temp array(up to down)
                        list.add(temp.get(i));

                    }
                }




        }
        System.out.println(list);

    }
}
