package RecursionPack;

public class OptimizePower {
    public static void main(String[] args){
        int a = 2;
        int b = 9;
        System.out.println(optPower(a , b));

    }
    public static int optPower(int a , int n){
        if(n==1){
            return a;
        }
        // tC = lon(n)
        int ans = optPower(a , n/2);
        if(n%2==0){
            return ans*ans;
        }
        else {
            return ans*ans*a;
        }
    }
}
