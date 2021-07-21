package RecursionPack;

import java.util.Scanner;

public class RatChase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [] [] maze = new char[n][m];
        for(int i=0;i<maze.length;i++){
            String str = sc.next();
            for(int j=0;i<m;i++){
                maze[n][m]=str.charAt(j);
            }
        }
    }
    public static int ratMazePath(boolean maze[][] , int r , int c,String str){
        if(r == maze.length-1 && c == maze[0].length-1){
            return 1;
        }

        //int ri = normalMazePath(maze,r,c+1);
        //int l = normalMazePath(maze,r,c-1);
        //int u = normalMazePath(maze,r-1,c);
        //int d = normalMazePath(maze,r+1,c);


        if(r<0 || r>=maze.length || c<0 || c>=maze[0].length || maze[r][c] ||maze[r][c]){
            return 0;

        }
        int [] row = {0,0,-1,1};
        int [] col = {1,-1,0,0};
        maze[r][c] = true;
        int ans =0;
        for(int i=0;i<col.length;i++){

            ans+= ratMazePath(maze,r+row[i] ,c+col[i],str);
        }
        maze[r][c]=false;
        return ans;
    }

}
