package StackPck;

import QueuePack.DynamicQueue;

public class Stack_Using_Queue {
    private DynamicQueue primary;
    private DynamicQueue helper;

    public Stack_Using_Queue(){
        this.primary = new DynamicQueue();
        this.helper = new DynamicQueue();
    }
    public int size(){
        return this.primary.size();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public void push(int item) throws Exception {
        while (!this.primary.isEmpty()){
            this.helper.enQueue(this.primary.deQueue());
        }
        this.primary.enQueue(item);

        while (!this.helper.isEmpty()){
            this.primary.enQueue(this.helper.deQueue());
        }
    }
    public void print() throws Exception {
        while (!primary.isEmpty()){
            System.out.print(primary.deQueue()+" ");
        }
    }
    public int pop() throws Exception {
        return this.primary.deQueue();
    }
    public int peek() throws Exception {
        return primary.getFront();
    }

}
