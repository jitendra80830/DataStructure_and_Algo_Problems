package StackPck;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(12);
        st.push(20);
        st.push(30);
        st.push(50);
        System.out.println(st);
        System.out.println(st.peek());
        st.remove(st.peek());
        //st.pe
        System.out.println(st);

    }
}
