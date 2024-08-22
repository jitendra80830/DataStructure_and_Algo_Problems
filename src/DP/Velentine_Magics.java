package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Velentine_Magics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] boys = new int[n];
        for (int i =0;i<boys.length;i++){
            boys[i] = sc.nextInt();
        }

        int [] girl = new int[m];
        for(int j =0;j<girl.length;j++){
            girl[j] = sc.nextInt();
        }
        Arrays.sort(boys);
        Arrays.sort(girl);
        System.out.println(velentineMagic(boys ,girl ,0 ,0));

        int dp[][] = new int[boys.length][girl.length];
        for (int arr[] : dp){
            Arrays.fill(arr , -1);
        }
        System.out.println(velentineMagicTD(boys ,girl , 0 ,0 ,dp));
    }
    public static int velentineMagic(int boys[] , int girls[] , int i ,int j){
        if(i == boys.length){
            return 0;
        }
        if(j==girls.length){
            return 1000000;
        }

        int gs = Math.abs(boys[i] - girls[j]) + velentineMagic(boys , girls , i+1 ,j+1); //for girl selected
        int gr = velentineMagic(boys ,girls ,i , j+1); // for girls rejected

       return Math.min(gs, gr); //min of both
    }
    public static int velentineMagicTD(int boys[] , int girls[] , int i ,int j ,int dp[][]){
        if(i == boys.length){
            return 0;
        }
        if(j==girls.length){
            return 1000000;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int gs = Math.abs(boys[i] - girls[j]) + velentineMagicTD(boys , girls , i+1 ,j+1 ,dp); //for girl selected
        int gr = velentineMagicTD(boys ,girls ,i , j+1 ,dp); // for girls rejected

        return dp[i][j] = Math.min(gs, gr); //min of both
    }
}
