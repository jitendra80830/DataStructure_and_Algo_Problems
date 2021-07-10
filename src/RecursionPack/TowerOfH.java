package RecursionPack;

public class TowerOfH {
    public static void main(String[] args){
        print_towerOfH(3,"T1","T2","T3");

    }
    public static void print_towerOfH(int n,String src,String hel,String des){
        if(n==0){
            return;
        }
        print_towerOfH(n-1,src,des,hel);
        System.out.println("Move  "+n+"th disk from "+src+" to destination "+des);
        print_towerOfH(n-1,hel,src,des);

    }
}
