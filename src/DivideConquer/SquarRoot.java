package DivideConquer;

import java.util.Scanner;

public class SquarRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp;
        int sq = num /2;
        do{
            temp = sq;
            sq = (temp+(num/temp))/2;
        }while ((temp-sq)!=0);
        System.out.println(sq);
    }
}
