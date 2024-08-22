package QueuePack;

import StackPck.DynamicStack;

public class Queue_Using_Stack {
    private DynamicStack primary;
    private DynamicStack helper;

    public Queue_Using_Stack(){
        this.primary = new DynamicStack();
        this.helper = new DynamicStack();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();

    }
    public void enQueue(int item) throws Exception {
        this.primary.push(item);
    }
    public int deQueue() throws Exception {
        while (this.primary.size()>1){
            this.helper.push(this.primary.pop()) ;
        }
        int item = this.primary.pop();
        while (this.helper.size()>1){
            this.primary.push(this.helper.pop()) ;
        }
        return item;

    }
    //public void display(){
      //  for(int i=0;i<this.primary.size();i++){
          //  System.out.println(this.primary[i]);
       // }
    //}
    public int getFront() throws Exception {
        while (this.primary.size()>1){
            this.helper.push(this.primary.pop()) ;
        }
        int item = this.primary.peek();
        while (this.helper.size()>1){
            this.primary.push(this.helper.pop()) ;
        }
        return item;

    }
}
