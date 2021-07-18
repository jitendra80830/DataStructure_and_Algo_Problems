package RecursionPack;

public class Subset {
    public static void main(String[] args){
        subset("123","");

    }
    public static void subset(String ques ,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String roq = ques.substring(i);
            String roa = ques.substring(0,i);
            subset(roq,ans+roa);
        }
    }
}
