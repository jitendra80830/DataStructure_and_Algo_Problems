package StringPack;

public class SwapWithoutTemp {
    public static void main(String[] args){
        String a= "hello";
        String b = "world";
        System.out.println("a = "+a+" and b = "+b);
        a = a+b; //helloworld
        b = a.substring(0 , a.length() - b.length()); // b = hello
        a = a.substring(b.length());
        System.out.println("a = "+a+" and b = "+b);

    }
}
