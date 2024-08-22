package StringPack;

public class Demo3 {
    public static void main(String[] args){
        System.out.println(20+30+"Hello"+30+40);
        System.out.println(20+30+" Hello "+(30+40));
        append();
    }
    public static void append(){
        String ans = "";
        for(int i=0;i<100000;i++){
            ans = ans + i;

        }
        System.out.println(ans);
    }
}
