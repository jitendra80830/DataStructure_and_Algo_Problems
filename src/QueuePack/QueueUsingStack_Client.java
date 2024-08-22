package QueuePack;

public class QueueUsingStack_Client {
    public static void main(String[] args) throws Exception {
        Queue_Using_Stack dq = new Queue_Using_Stack();
        dq.enQueue(12);
        dq.enQueue(22);
        dq.enQueue(32);
        dq.enQueue(42);
        dq.enQueue(52);
        System.out.println(dq.deQueue());
        System.out.println(dq.getFront());
        System.out.println(dq.size());
        System.out.println(dq.deQueue());
        System.out.println(dq.getFront());
    }
}
