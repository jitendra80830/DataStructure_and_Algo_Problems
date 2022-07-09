package RecursionPack;

public class Permutation {

    public static void main(String[] args){

       // permutation("K7D51","");
        System.out.println();
        permutaion1("abca" , "");

    }

    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        boolean[] visited = new boolean[256];
        for (int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            if(!visited[ch]) {
                visited[ch]=true;
                permutation(ques.substring(0, i) + ques.substring(i + 1), ans + ch);
            }

        }

    }
    public static void permutaion1(String ques ,String ans){ //for duplicate permutation
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            permutaion1(ques.substring(0 ,i) + ques.substring(i+1) , ch+ans);
        }
    }
}
