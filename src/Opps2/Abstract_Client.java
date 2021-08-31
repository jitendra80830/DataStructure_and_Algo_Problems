package Opps2;

public class Abstract_Client extends Abstract_Demo{
    public static void main(String[] args){
        Abstract_Client ab= new Abstract_Client();
        fun1();
        ab.fun();
        ab.fun2();

    }

    @Override
    public void fun() {
        System.out.println("fun");
    }
    public void fun2(){
        System.out.println("fun2");
    }
}
