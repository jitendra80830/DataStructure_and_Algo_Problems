package RecursionPack;

public class MazePath {
    public static void main(String[] args){
        int m = 3;
        int n = 3;
        System.out.println("\n"+print_MazePath(0,0,m,n,""));
    }

    private static int print_MazePath(int cr, int cc, int er, int ec, String ans){
        if(cr == er-1 && cc==ec-1){
            System.out.print(ans+" ");
            return 1;
        }

        if(cr>=er || cc>=ec){
            return 0;
        }
        int ht=print_MazePath(cr,cc+1,er,ec,ans+"H"); //for horizontal
        int vt= print_MazePath(cr+1,cc,er,ec,ans+"V"); //for vertical
        return ht+vt;
    }
}
