package QueuePack;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        Queue q  = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(60);
        q.enQueue(70);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.getFront());
        System.out.println(q.size());
    }
}
