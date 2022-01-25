package RecursionPack;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args){
        int arr[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        //subset_Ele(arr,0,"");
        //subset_User(arr,0,"");
        subset_User_2D(arr,0,list,ans);
        System.out.println(ans);

    }
    public static void subset_Ele(int ques[] , int i, String ans){
        if(i==ques.length){
            System.out.print(ans+" ");
            return;
        }

        subset_Ele(ques,i+1,ans+ques[i]);
        subset_Ele(ques,i+1,ans);
    }
    public static void subset_User(int [] ques ,int index,String ans){

        System.out.println(ans);


        for (int i=index;i<ques.length;i++){


            subset_User(ques,i+1,ans+ques[i]);
        }
    }
    public static void subset_User_2D(int [] ques , int index, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){

        ans.add(new ArrayList<Integer>(list));



        for (int i=index;i<ques.length;i++){
            list.add(ques[i]);
            subset_User_2D(ques,i+1,list,ans);
            list.remove(list.size()-1);
        }
    }

}
