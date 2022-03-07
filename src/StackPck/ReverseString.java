package StackPck;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
    }

    private static void reverseString(String str) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i <str.length(); i++) {
            st.push(str.charAt(i));
        }
        for (int i = 0; i <str.length() ; i++) {
            char ch = st.pop();
            ans = ans+ch;

        }
        System.out.println(ans);

    }
}
