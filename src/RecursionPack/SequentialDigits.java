package RecursionPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SequentialDigits {
    public static void main(String[] args){
        int low = 1000;
        int high = 13000;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            sequential_Digits(i,low,high,ans);

        }
        Collections.sort(ans);
        System.out.println(ans);


    }

    private static void sequential_Digits(int i, int low, int high, ArrayList<Integer> ans) {
        if(low<=i && i<=high){
            ans.add(i);

        }
        int ld = i%10;
        if(i>high || ld==9){
            return;
        }

        sequential_Digits((i*10)+ld+1,low,high,ans);
    }
}
