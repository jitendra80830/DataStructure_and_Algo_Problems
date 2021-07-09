package RecursionPack;

public class Sub_Sequence {
    public static void main(String[] args){
        sub_Seq("abc","");
    }

    private static void sub_Seq(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);

        sub_Seq(ques.substring(1),ans); //bc,""
        sub_Seq(ques.substring(1),ans+ch); //bc ,"a"
    }
}
