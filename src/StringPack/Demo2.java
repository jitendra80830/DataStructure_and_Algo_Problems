package StringPack;

public class Demo2 {
    public static void main(String[] args){
        String s = "hello";
        String s1 ="hello";

        if(s == s1){
            System.out.println("bye");
        }else
            System.out.println("hi");
        String s2 = new String("hello");

        if(s2 == s1){
            System.out.println("bye");
        }else
            System.out.println("hi");

        if(s.equals(s1)){
            System.out.println("bye");
        }else
            System.out.println("hi");

        if(s2.equals(s1)){
            System.out.println("bye");
        }else
            System.out.println("hi");

        //index of
        System.out.println(s1.indexOf('l'));

        System.out.println(s.lastIndexOf('l'));

        System.out.println(s1.startsWith("h"));

        System.out.println(s.endsWith("l"));
    }
}
