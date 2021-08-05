package QueuePack;

public class DynamicQueueClient {
    public static void main(String[] args) throws Exception {
        DynamicQueue dq = new DynamicQueue();
        dq.enQueue(11);
        dq.enQueue(22);
        dq.enQueue(33);
        dq.enQueue(44);
        dq.enQueue(55);
        System.out.println(dq.deQueue());
        dq.enQueue(66);
        dq.enQueue(77);
        System.out.println(dq.deQueue());
        dq.display();
    }
}
