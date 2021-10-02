package Questions;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //System.out.println(fistStringCompression(s));
        System.out.println(SecondStringCompression(s));
    }
    public static String fistStringCompression(String str){
        String s = String.valueOf(str.charAt(0));
       // System.out.println(s);
        for (int i =1;i<str.length();i++){
            char next = str.charAt(i);
            char prev = str.charAt(i-1);
            if(next!=prev){
                s+=next;
            }
        }
        return s;


    }
    public static String SecondStringCompression(String str){
        String s = String.valueOf(str.charAt(0));
        // System.out.println(s);
        int count =1;
        for (int i =1;i<str.length();i++){
            char next = str.charAt(i);
            char prev = str.charAt(i-1);
            if(next==prev){
                count++;

            }else {
                if(count>1){
                    s+=count;
                    count =1;
                }
                s+=next;
            }

        }
        if(count>1){
            s+=count;
            count =1;
        }
        return s;


    }
}
