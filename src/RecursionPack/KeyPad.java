package RecursionPack;

public class KeyPad {
    static String [] getString = {"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args){
        keyPaid("61","");

    }
    public static void keyPaid(String ques , String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0); //at 0 char=1
        String keyString = getString[ch-'1']; //1=48 ascci value ,indexing from 1
        for(int i=0;i<keyString.length();i++){
            keyPaid(ques.substring(1),ans+keyString.charAt(i));
        }



    }
}
