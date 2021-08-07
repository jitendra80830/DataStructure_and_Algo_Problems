package StackPck;

public class Stack_Using_Queue_Client {
    public static void main(String[] args) throws Exception {
        Stack_Using_Queue s = new Stack_Using_Queue();
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        s.push(52);
        s.push(62);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
