package RecursionPack;

import java.util.ArrayList;

public class GenerateParanthesis {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        generateParanthesis(3,0,0,"",list);
        System.out.println(list);
    }

    private static void generateParanthesis(int n, int nop, int noc, String ans,ArrayList<String> list) {
        if(nop==n && noc==n){
            list.add(ans);
            return;
        }

        if(nop<n){
            generateParanthesis(n,nop+1,noc,ans+"(",list);
        }
        if(noc<nop){
            generateParanthesis(n,nop,noc+1,ans+")",list);
        }
    }
}
