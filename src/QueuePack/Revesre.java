package QueuePack;

public class Revesre {
    public static void main(String[] args) throws Exception {
        DynamicQueue dq = new DynamicQueue();
        for (int i =1;i<5;i++){
            dq.enQueue(10*i);
        }
        dq.display();
        System.out.println(".........................");
        reverse(dq);
        dq.display();
    }
    public static void reverse(DynamicQueue q) throws Exception {

        if(q.isEmpty()){
            return;
        }
        int item = q.deQueue();
        reverse(q);
        q.enQueue(item);
    }
}
