package QueuePack;

public class Queue {
    protected int[] data;
    protected int front;
    private int size;
    public Queue(){
        this.data = new int[5];
        this.front =0;
        this.size =0;
    }
    public Queue(int cap){
        this.data = new int[cap];
        this.front =0;
        this.size =0;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public int size(){
        return this.size;
    }
    public boolean isFull(){
        return this.size == this.data.length;
    }
    public void enQueue(int item) throws Exception{
        if(this.isFull()){
            throw new Exception("Queue is Full");
        }
        int idx = (this.front+this.size) % this.data.length;
        this.data[idx]=item;
        size++;
    }
    public int deQueue() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Queue  is Empty");
        }
        int item =this.data[this.front];
        this.size--;
        this.front = (this.front+1)% this.data.length;
        return item;

    }
    public int getFront() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue  is Empty");
        }
        return this.data[this.front];
    }
    public void display(){
        for(int i = 0;i<this.size;i++){
            int idx= (this.front+i)%this.data.length;
            System.out.print(this.data[idx]+" ");
        }
        System.out.println();
    }
}
