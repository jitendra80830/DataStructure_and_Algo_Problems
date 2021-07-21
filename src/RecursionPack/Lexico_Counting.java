package RecursionPack;

public class Lexico_Counting {
    public static void main(String[] args){
        lexiCounting(0,1000);

    }
    public static void lexiCounting(int curr , int end){
        if(curr>end){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            lexiCounting(curr*10+i,end);

        }
    }
}
