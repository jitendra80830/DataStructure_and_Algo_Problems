package RecursionPack;
public class Factorial {
    public static void main(String[] args){
        //System.out.println(fib(5));
        System.out.println(fav_tail(5,1));

    }
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        return n* fac(n-1);
    }
    public static int fav_tail(int n, int ans){
        if(n==0){
            return ans;

        }
        return fav_tail(n-1,ans*n);
    }
}
