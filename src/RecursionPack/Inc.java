package RecursionPack;

public class Inc {
    public static void main(String[] args){
        dc(5);

    }
    public static void dc(int n){
        //base case
        if(n==0){
            return;
        }
        dc(n-1);
        System.out.println(n);
    }
}
