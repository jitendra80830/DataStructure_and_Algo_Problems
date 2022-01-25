package StringPack;

import java.util.HashMap;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        getCountChar(str);
    }

    private static void getCountChar(String str) {
        HashMap<Character , Integer> charMap = new HashMap<>();

        char charArray[] = str.toCharArray();
        for (char c : charArray){
            if(charMap.containsKey(c)){
                charMap.put(c , charMap.get(c)+1);
            }else {
                charMap.put(c ,1);
            }
        }
        System.out.println(charMap);
    }
}
