package RecursionPack;

public class  Board_Path {
    public static void main(String[] args){
        int n = 4;
        boardPath(0,n,"");
        System.out.println(Count_boardPath(0,n,""));

    }
    public static void boardPath(int curr , int end , String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        for(int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
            boardPath(curr + dice, end, ans+dice);
        }
    }
    public static int Count_boardPath(int curr , int end , String ans){
        if(curr==end){
            //System.out.println(ans);
            return 1;
        }
        int count =0;
        for(int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
           count+= Count_boardPath(curr + dice, end, ans+dice);
        }
        return count;
    }
}
