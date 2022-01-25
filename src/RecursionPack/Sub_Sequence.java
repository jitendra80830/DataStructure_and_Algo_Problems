package RecursionPack;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Sub_Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sub_Seq(n,"");
       // System.out.println(Count_sub_Seq("abc",""));
    }

    public static void sub_Seq(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);

        sub_Seq(ques.substring(1),ans); //bc,""
        sub_Seq(ques.substring(1),ans+ch); //bc ,"a"
    }
    public static int Count_sub_Seq(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return 1;
        }
        char ch = ques.charAt(0);

        int count= Count_sub_Seq(ques.substring(1),ans); //bc,""
        int count1= Count_sub_Seq(ques.substring(1),ans+ch); //bc ,"a"
        return count+count1;
    }

}
