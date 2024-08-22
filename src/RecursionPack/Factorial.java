package RecursionPack;
public class Factorial {
    public static void main(String[] args){
        //System.out.println(fac(5));
        //System.out.println(fav_tail(5,1));
        fac1(-1);

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
    public static void fac1(int number){
        if(number < 1){
            System.out.println("Number is negative ");
        }
        int factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
