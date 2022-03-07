package StackPck;
import java.util.*;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> min_Stack;
    private int min;

    public MinStack(){
        this.min_Stack = new Stack<>();
        this.min = min;
    }
    public int size(){
        return this.min_Stack.size();
    }
    public boolean isEmpty(){
        return this.min_Stack.isEmpty();
    }
    public  void push(int item){
        if(this.min_Stack.isEmpty()){
            this.min_Stack.push(item);
            this.min = item;
        }
            else if(item > this.min){
                this.min_Stack.push(item);

        }else {
            int x = 2 * item - this.min;
           this. min_Stack.push(x);
            this.min = item;
        }
    }
    public int pop() throws Exception {
        if(min_Stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        if(this.min_Stack.peek() < min){
            int x = this.min_Stack.pop();
            int rt = this.min;
            this.min = 2 * this.min - x;
            return rt;
        }else {
            return this.min_Stack.pop();
        }
    }
    public int peek(){
        return this.min_Stack.pop();
    }
    public int min(){
        return this.min;
    }
}
