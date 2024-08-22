//Jitendra kumar <jitendrakumar89973@gmail.com> 97098340297,8083056405
import java.util.ArrayList;
import java.util.Scanner;

public class CodingChalange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jk_n = sc.nextInt();
        int jk_k = sc.nextInt();

        String jk_NtoString = Integer.toString(jk_n);
       permutaionDivisibility(jk_NtoString ,jk_k , "");

    }

    private static void permutaionDivisibility(String jk_ntoString, int jk_k, String ans) {


        if(jk_ntoString.length() == 0){
            int jk_ans = Integer.parseInt(ans);
            if(jk_ans%jk_k == 0){

                System.out.print(jk_ans);
            }


        }

        for(int i=0;i<jk_ntoString.length();i++){
            char ch = jk_ntoString.charAt(i);
            permutaionDivisibility(jk_ntoString.substring(0 ,i) + jk_ntoString.substring(i+1) ,jk_k, ch+ans);
        }

    }

}
