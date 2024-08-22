package Questions;

public class SubsequenceString {
    public static void main(String [] args){
        //subsequenceString("abc","");
        System.out.println(subsequenceCount("abcd",""));

    }
    public static void subsequenceString(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;

        }
        char ch = ques.charAt(0);

        subsequenceString(ques.substring(1) , ans);
        subsequenceString(ques.substring(1) , ch+ans);

    }
    public static int subsequenceCount(String ques , String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return 1;

        }
        char ch = ques.charAt(0);

        int count1 = subsequenceCount(ques.substring(1) , ans);
       int count2 = subsequenceCount(ques.substring(1) , ch+ans);
       return count1+count2;

    }
}
