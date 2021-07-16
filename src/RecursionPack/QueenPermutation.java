package RecursionPack;

public class QueenPermutation {
    public static void main(String[] args){
        boolean [] board = new boolean[4];
        int tq = 2;
        queenPermutation(board , tq,0,"");
    }

    private static void queenPermutation(boolean[] board, int tq, int qpsf, String ans) {
        if(tq == qpsf){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<board.length;i++){
            if(!board[i]){
                board[i]=true;
                queenPermutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
                board[i]=false;
            }
        }
    }
}
