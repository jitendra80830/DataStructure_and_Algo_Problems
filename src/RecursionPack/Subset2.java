package RecursionPack;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Subset2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = {1,2,2};
        subset2(arr,0,list,ans);
        System.out.println(ans);

    }
    public static void subset2(int ques[] , int index, List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));



        for(int i=index;i<ques.length;i++){
            if(i!=index && ques[i]==ques[i-1]) {
                continue;
            }
                list.add(ques[i]);
                subset2(ques, i + 1, list, ans);
                list.remove(list.size()-1);
        }
    }
}
