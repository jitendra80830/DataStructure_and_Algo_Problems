package Arraylist;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);

        //0 to list.size
        list.add(2,33);
        list.add(1,80);

        // 0 to list.size-1
        System.out.println(list.get(2));


        System.out.println(list);

        //0 to list.size-1
        list.set(1,90);
        System.out.println(list);

        //0 to list.size-1
        System.out.println(list.remove(1));

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        for(int val : list){
            System.out.print(val+" ");
        }

    }
}
