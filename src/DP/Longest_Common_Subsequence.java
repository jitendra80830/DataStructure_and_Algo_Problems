package DP;

import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args){
        String text1 = "abcde";
        String  text2 = "ace";
        System.out.println(lCS(text1 ,text2));
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int []arr:dp){
            Arrays.fill(arr ,-1);
        }
        System.out.println(lCSTD(text1 ,text2 ,dp));
        System.out.println(LCsBU(text1 ,text2));
    }
    public static int lCS(String text1 , String  text2){
        if(text1.length() ==0 || text2.length()==0){ //if both string ka length 0 ho gya then return 0
            return 0;
        }

        if(text1.charAt(0) == text2.charAt(0)){ // if text1 ka 0 index la value and text2 ke 0 index ka value same ho then call 1+lcs() means from next index
           return 1+ lCS(text1.substring(1) ,text2.substring(1));
        }else {
            return Math.max(lCS(text1.substring(1) , text2) , lCS(text1 ,text2.substring(1))); // otherwise ek bar next index se text1 ka call hoga ya 2nd time text2 ke next index se call hoga
        }

    }
    public static int lCSTD(String text1 , String  text2 ,int dp[][]){ // same but using DP,
        if(text1.length() ==0 || text2.length()==0){
            return 0;
        }

        if(dp[text1.length()][text2.length()]!=-1){
            return dp[text1.length()][text2.length()];
        }
        if(text1.charAt(0) == text2.charAt(0)){
            return 1+ lCSTD(text1.substring(1) ,text2.substring(1) ,dp);
        }else {
            return dp[text1.length()][text2.length()] =  Math.max(lCSTD(text1.substring(1) , text2 ,dp) , lCSTD(text1 ,text2.substring(1) ,dp));
            // ek bar text1 me index increase kr rahe hai and second me text2 me kr rha hei(increasing means ek delete kr rhe hai
        }

    }
    public static int LCsBU(String text1 ,String text2){
        int dp[][] = new int[text1.length()+1][text2.length()+1];

        for(int i =1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){// if both'a index ka value is same then store in dp with lpus 1
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()]; // return last index value because ans stored on last index
    }
}
