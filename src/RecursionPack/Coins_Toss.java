package RecursionPack;

import java.util.Scanner;

public class Coins_Toss {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coins_Toss(n,"");
            
    }

    private static void coins_Toss(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        coins_Toss(n-1,ans+"H"); //HEAD
        coins_Toss(n-1,ans+"T");//TAIL
    }

}
