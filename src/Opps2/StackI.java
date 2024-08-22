package Opps2;

public interface StackI {
    public void push();

    public int pop();

    default void fun(){
        System.out.println("fun");
    }
}
