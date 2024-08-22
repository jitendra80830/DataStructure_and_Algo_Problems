package StackPck;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args){
        int arr []  = {30, 35, 40, 38, 35};
        stockSpan(arr);

    }
    public static void stockSpan(int arr[]){
        int ans [] = new int[arr.length];//ans arr for span
        Stack<Integer> stack = new Stack<>(); // stack
        for(int i=0;i<arr.length;i++){
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){ // if stack is not empty and arr[i]>peek of stack then pop from stack
                stack.pop();
            }
            if(stack.isEmpty()){ // if stack is empty then ans[i] me increament with 1
                ans[i] = i+1;
            }else //ans[i] me i - peek's index of stack
                ans[i] = i- stack.peek();
                stack.push(i); // and push that element in stack
        }

        System.out.println(Arrays.toString(ans));
    }
}
