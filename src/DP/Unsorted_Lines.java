package DP;

public class Unsorted_Lines {
    public static void main(String[] args){
        int num1[] = {2,5,1,2,5};
        int num2[] = {10,5,2,1,5,2};
        System.out.println(unsorted_LInes(num1 ,num2));

    }
    public static int unsorted_LInes(int []num1 ,int []num2){
        int dp[][] = new int[num1.length +1][num2.length+1];

        for(int i =1;i<=num1.length;i++){
            for(int j=1;j<=num2.length;j++){
                if(num1[i-1]==num2[j-1]){// if both'a index ka value is same then store in dp with lpus 1 ,means creating lines
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[num1.length][num2.length]; // return last index value because ans stored on last index
    }
}
