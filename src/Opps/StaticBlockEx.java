package Opps;

public class StaticBlockEx {
    String name;
    int age;
    public StaticBlockEx(String name , int age){
        System.out.println("Hello Constructor");
        this.name=name;
        this.age=age;
    }
    static {
        System.out.println("Hello static");
    }
}
