package StackPck;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args){
        int arr []  = {30, 35, 40, 38, 35};
        stockSpan(arr);

    }
    public static void stockSpan(int arr[]){
        int ans [] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = i+1;
            }else
                ans[i] = i- stack.peek();
                stack.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
