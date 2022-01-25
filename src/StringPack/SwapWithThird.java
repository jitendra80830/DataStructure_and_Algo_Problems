package StringPack;

public class SwapWithThird {
    public static void main(String[] args){
        String a = "hello";
        String b = "world";
        System.out.println("a = "+a+" and b = "+b);
        String s = "";
        s = s+a;
        a = b;
        b = s;
        System.out.println("a = "+a+" and b = "+b);

    }
}
