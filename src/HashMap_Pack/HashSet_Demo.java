package HashMap_Pack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Demo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        //HashSet<String> seta = new HashSet<>();
        set.add("Jitendra");
        set.add("Samir");
        set.add("Ritesh");
        set.add("Tridip");
        set.add("Aman");
        set.add("Aman");
       // set.add(null); // Allowed
        System.out.println(set);
        //System.out.println(set.contains("Jitendra"));


        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Jitendra");
        treeSet.add("Samir");
        treeSet.add("Ritesh");
        treeSet.add("Tridip");
       // treeSet.add(null);// Not Allowed
      treeSet.add("Aman");
      treeSet.add("Aman");
//        treeSet.add("abc");
//        treeSet.add("ab");
//        treeSet.add("a");
//        treeSet.add("c");
//        treeSet.add("ac");
//        treeSet.add("b");
//        treeSet.add("bc");


        System.out.println(treeSet); //it give sorted order


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(); // it give same order which you written Log(n)

        linkedHashSet.add("Jitendra");
        linkedHashSet.add("Samir");
        linkedHashSet.add("Ritesh");
        linkedHashSet.add("Tridip");
        linkedHashSet.add("Aman");
        //linkedHashSet.add(null);//Allowed
        System.out.println(linkedHashSet);

        HashSet<Integer> s = new HashSet<>();
        s.add(7);
        s.add(5);
        s.add(6);
        s.add(3);
        s.add(7);
        s.add(31);
        System.out.println(s);

    }
}
