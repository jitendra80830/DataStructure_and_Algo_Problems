package RecursionPack;

public class Tilling_Problem {
    public static void main(String[] args){
        //int m=4;
        int n=6;
        System.out.println(tilling_Problem(n));
    }

    public static int tilling_Problem(int n) {
        if(n<4){
            return 1;
        }
        int h = tilling_Problem(n-4);
        int v = tilling_Problem(n-1);
        return h+v;
    }
}
