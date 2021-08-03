package StackPck;

public class Stack {
    private int [] data;
    int top;
    public Stack(){
        this.data = new int[5];
        this.top = -1;
    }
    public Stack(int cap){
        this.data = new int[cap];
        this.top = -1;
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top == data.length-1;
    }
    public void push(int item) throws Exception{
        if(this.isFull()){
            throw new Exception("Stack is Full");
        }
        this.top++;
        this.data[this.top] = item;

    }
    public int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int item = this.data[this.top];
        this.data[this.top]=0;
        top--;
        return item;
    }
    public int peek() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int item = this.data[this.top];
        return item;
    }
    public int size(){
        return this.top+1;
    }
    public void display(){
        for(int i = this.top;i>=0;i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
