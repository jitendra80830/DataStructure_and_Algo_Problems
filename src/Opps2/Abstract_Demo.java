package Opps2;

public abstract class Abstract_Demo {
    public abstract void fun(); //static not allowed
    public static void fun1(){ //non abstract allow static
        System.out.println("Fin1");
    }
    //we can't create abstract class's object
}
