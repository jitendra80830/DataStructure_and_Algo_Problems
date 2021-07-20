package RecursionPack;

public class Normal_MazePath {
    public static void main(String[] args){

        boolean maze [] [] = new boolean[3][3];
        System.out.println(normalMazePath(maze,0,0));


    }
    public static int normalMazePath(boolean maze[][] , int r ,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            return 1;
        }

        //int ri = normalMazePath(maze,r,c+1);
        //int l = normalMazePath(maze,r,c-1);
        //int u = normalMazePath(maze,r-1,c);
        //int d = normalMazePath(maze,r+1,c);


        if(r<0 || r>=maze.length || c<0 || c>=maze[0].length || maze[r][c]){
            return 0;

        }
        int [] row = {0,0,-1,1};
        int [] col = {1,-1,0,0};
        maze[r][c] = true;
        int ans =0;
        for(int i=0;i<col.length;i++){

            ans+=normalMazePath(maze,r+row[i] ,c+col[i]);
        }
        maze[r][c]=false;
        return ans;
    }
}
