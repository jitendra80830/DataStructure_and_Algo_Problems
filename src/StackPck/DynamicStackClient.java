package StackPck;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        DynamicStack ds = new DynamicStack();
        ds.push(12);
        ds.push(22);
        ds.push(32);
        ds.push(42);
        ds.push(52);
        System.out.println(ds.pop());
        ds.push(62);
        ds.display();
    }
}
