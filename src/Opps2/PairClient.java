package Opps2;

import java.util.ArrayList;

public class PairClient {
    public static void main(String[] args){
        Pair<Cars> p = new Pair<>();
        p.x = new Cars(100,30,"Red");
        System.out.println(p.x);
        Pair pp = new Pair();
        pp.x = 100;
        pp.x = "Ram";

        ArrayList list = new ArrayList();
        list.add("Ram");
        list.add(11);
        list.add('A');
        list.add(new Cars());
        System.out.println(list);
        list.remove(0); // we can't provide data type that which types of data you are removing
    }
}
