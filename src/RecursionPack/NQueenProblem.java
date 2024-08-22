package RecursionPack;

public class NQueenProblem {
    public static void main(String[] args){
        int n=4;
        boolean board [] [] = new boolean[n][n];
        nQueen(board,0,n);
    }

    private static void nQueen(boolean[][] board, int row, int n) {
        if(n==0){
            display(board);
            System.out.println();
            return;
        }

        for(int col =0;col<board.length;col++){
            if(isIt_Safe(board,row,col)){
                board[row][col]=true;
                nQueen(board,row+1,n-1);
                board[row][col]=false;

            }
        }

    }

    public static void display(boolean[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!board[i][j]){
                    System.out.print(board[i][j]+" ");
                }
                else {
                    System.out.print("Q"+" ");

                }
            }
            System.out.println();
        }
    }

    public static boolean isIt_Safe(boolean[][] board, int row, int col) {
        //vertical
        int r=row-1;
        int c = col;
        while(r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }
        //left diagonal
        r = row-1;
        c = col-1;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r = row-1;
        c = col+1;
        while(r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
