package StringPack;

import java.util.Scanner;

public class MaxOccurChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findMaxChar(str);
    }

    private static void findMaxChar(String str) {
        char max_char =str.charAt(0);
        int max_count =0;
        for (int i = 0; i <str.length() ; i++) {
            char curr_char = str.charAt(i);
            int curr_count =1;
            for (int j = i+1; j < str.length(); j++) {
                if(curr_char == str.charAt(j)){
                    curr_count++;
                }
                if(max_count < curr_count){
                    max_count = curr_count;
                    max_char = curr_char;
                }

            }

        }
        System.out.println(max_char+" "+max_count);
    }
}
