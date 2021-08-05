package Opps;

public class StaticVarExample {
    String name;
    int age;
    static int no_of_Students; //static var

    public StaticVarExample(String name , int age){
        this.name = name;
        this.age = age;
        no_of_Students++;
    }
}
