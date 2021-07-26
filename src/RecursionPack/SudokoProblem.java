package RecursionPack;

public class SudokoProblem {
    public static void main(String[] args){
        int [][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        sudokoProbelm(grid,0,0);
    }
    public static boolean sudokoProbelm(int [][] grid , int row ,int col){

        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(grid);
            return true;
        }

        if(grid[row][col]!=0){
            return sudokoProbelm(grid,row,col+1);
        }else {
            for(int val =1;val<=9;val++){
                if(is_it_Safe(grid,row,col,val)){
                    grid[row][col]=val;
                    boolean ans =sudokoProbelm(grid,row,col+1);
                    if(ans){
                        return true;
                    }
                    grid[row][col]=0;
                }
            }
            return false;
        }

    }

    public static boolean is_it_Safe(int[][] grid, int row, int col,int val) {
        //row checking
        int c =0;
        int r = row;
        while(c<grid[0].length){
            if(grid[r][c]==val){
                return false;
            }
            c++;
        }
        //column checking
        c = col;
        r=0;
        while (r<grid.length){
            if(grid[r][c]==val){
                return false;
            }
            r++;
        }
        //3*3
        r = row-row%3;
        c= col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[r][c]==val){
                    return false;
                }
            }
        }
        return true;

    }

    public static void display(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
