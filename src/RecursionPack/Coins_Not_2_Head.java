package RecursionPack;

public class Coins_Not_2_Head {
    public static void main(String[] args){
        coins_Not_2_Head(3,"",false);

    }
    private static void coins_Not_2_Head(int n, String ans, boolean flag) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(!flag) {
            coins_Not_2_Head(n - 1, ans + "H",true); //HEAD
        }
        coins_Not_2_Head(n-1,ans+"T",false);//TAIL
    }
}
