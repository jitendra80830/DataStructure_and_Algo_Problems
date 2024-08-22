package RecursionPack;

public class MazePath {
    public static void main(String[] args){
        int m = 3;
        int n = 3;
        print_MazePath(0,0,m,n,"");
        System.out.println("\n"+count_MazePath(0,0,m,n,""));
        System.out.println("\n"+count_MazePath2(0,0,n,n,""));

    }

    private static void print_MazePath(int cr, int cc, int er, int ec, String ans){
        if(cr == er-1 && cc==ec-1){
            System.out.print(ans+" ");
            return;
        }

        if(cr>=er || cc>=ec){
            return;
        }
        print_MazePath(cr,cc+1,er,ec,ans+"H"); //for horizontal
        print_MazePath(cr+1,cc,er,ec,ans+"V"); //for vertical

    }
    private static int count_MazePath(int cr, int cc, int er, int ec, String ans){
        if(cr == er-1 && cc==ec-1){
            System.out.print(ans+" ");
            return 1;
        }

        if(cr>=er || cc>=ec){
            return 0;
        }
        int ht=count_MazePath(cr,cc+1,er,ec,ans+"H"); //for horizontal
        int vt= count_MazePath(cr+1,cc,er,ec,ans+"V"); //for vertical
        return ht+vt;
    }

    //wront way priting
    private static int count_MazePath2(int cr, int cc, int er, int ec, String ans){
        if(cr == er-1 && cc==ec-1){
            System.out.print(ans+" ");
            return 1;
        }

//        if(cr>=er || cc>=ec){
//            return 0;
//        }
        int cout =0;
        if(cr+1 <= er) {
            cout += count_MazePath2(cr + 1, cc, er, ec, ans + "V"); //for vertical
        }
        if(cc+1 <=ec) {
            cout += count_MazePath2(cr, cc + 1, er, ec, ans + "H"); //for horizontal
        }
        if(cc+1<=ec && cr+1<=er){
        cout+= count_MazePath2(cr+1, cc+1,er ,ec,"D"); //diogonal
            }

        return cout;
    }
}
