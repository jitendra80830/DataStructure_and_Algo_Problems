package RecursionPack;

public class QueenCombinations {
    public static void main(String[] args){
        boolean [] board = new boolean[4];
        int tq = 2;
        queenCombination(board,-1,tq,0,"");

    }
    public static void queenCombination(boolean board[],int last_index,int tq,int qpsf,String ans){
        if(tq == qpsf){
            System.out.println(ans);
            return;
        }
        for(int i =last_index+1;i<board.length;i++){
            if(!board[i]){
                board[i]=true;
                queenCombination(board,i,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
                board[i]=false;
            }
        }
    }
}
