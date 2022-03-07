package DP;

public class Fibbonacci {
    public static void main(String[] args){
        int n = 5;
        int dis[] = new int[n+1];
        //System.out.println(fib(n));
        System.out.println(fibNTD(n ,dis));
        //System.out.println(fibNBU(n));
        //System.out.println(fibNITOp(n));

    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        System.out.println(n);
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int fibn = f1+f2;
        return fibn;
    }
    //O(N)
    public static int fibNTD(int n , int dp[]){
        if(n==0 || n==1){
            return n;
        }
        //before calling function checking it is allready exits or not if yes then return otherwise call func
        if(dp[n]!=0){
            return dp[n];
        }
        System.out.println(n);
        int f1 = fibNTD(n-1 ,dp);
        int f2 = fibNTD(n-2,dp);
        int fibn = f1+f2;
        dp[n] = fibn;// before retuning store in array
        return fibn;
    }
    //O(N)
    public static int fibNBU(int n){
        int dp[] = new int[n+1];

        dp[0] = 0;//0 at 0 index
        dp[1] = 1;//1 at 1 index

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int fibNITOp(int n){
        int a = 0;
        int b = 1;

        for (int i=2;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;

        }
        return b;
    }
}
