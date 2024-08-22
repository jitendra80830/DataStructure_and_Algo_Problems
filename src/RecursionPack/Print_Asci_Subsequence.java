package RecursionPack;

public class Print_Asci_Subsequence {
    public static void main(String[] args){
        String ques = "ab";
        print_Asci_Subsequence(ques ,"" ,0);

    }
    public static void print_Asci_Subsequence(String ques , String ans ,int i){
        if(i == ques.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(i);
        print_Asci_Subsequence(ques ,ans ,i+1);
        print_Asci_Subsequence(ques ,ans+ch ,i+1);
        print_Asci_Subsequence(ques , ans+(int)ch ,i+1);

    }
}
