package Opps;

public class UnchekedExDemo {

    public void fun(int i){
        System.out.println("Hello1");
        if(i<=0){
            throw new RuntimeException();
        }
        System.out.println("Hello");

    }
}
