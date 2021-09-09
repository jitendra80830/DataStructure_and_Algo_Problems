package HashMap_Pack;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Demo {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Jitendra");
        set.add("Samir");
        set.add("Ritesh");
        set.add("Tridip");
        set.add("Aman");
        System.out.println(set);
        //System.out.println(set.contains("Jitendra"));


        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Jitendra");
        treeSet.add("Samir");
        treeSet.add("Ritesh");
        treeSet.add("Tridip");
        treeSet.add("Aman");
        System.out.println(treeSet); //it give sorted order

    }
}
