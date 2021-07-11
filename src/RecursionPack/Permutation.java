package RecursionPack;

public class Permutation {

    public static void main(String[] args){

        permutation("abc","");

    }
    static boolean[] visited = new boolean[256];
    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            if(!visited[ch]) {
                visited[ch]=true;
                permutation(ques.substring(0, i) + ques.substring(i + 1), ans + ch);
            }

        }

    }
}
