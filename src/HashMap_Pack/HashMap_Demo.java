package HashMap_Pack;

import java.util.*;

class Hashmap {
    public static void main(String[] args){
        HashMap<String , Integer> map = new HashMap<>(); //key pair values in hashmap  tc=o(1)

        map.put("Ram",87);
        map.put("jitendra",90);
        map.put("Rakesh",70);
        map.put("Akash",22);
        map.put("Ramesh",27);
        map.put("Raju",95);
       // map.put(null , null);
        System.out.println(map);

        //        System.out.println(map.containsKey("ram")); //o(1)
//        System.out.println(map.get("Ram")); // print value of keys o(1)
//
//        Set<String> key = map.keySet(); // Set is Interface
//        for (String k : key){
//            System.out.println(k+" "+map.get(k));
//
//        }
//        ArrayList<String> list = new ArrayList<>( map.keySet());
//        System.out.println(list);


        TreeMap<String , Integer> treeMap = new TreeMap<>(); //it give sorted key  tc=log(n)
        treeMap.put("Ram",87);
        treeMap.put("Jitendra",90);
        treeMap.put("Rakesh",70);
        treeMap.put("Akash",22);
        treeMap.put("Ramesh",27);
        treeMap.put("Raju",95);
        //treeMap.put(null , null); // not allowed
        //treeMap.put("A" , null); // Allowed
        System.out.println(treeMap);
//        System.out.println(treeMap.containsKey("Ram")); //log(n)
//        System.out.println(treeMap.get("Jitendra"));//log(n)


        LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>(); //O(1)

        linkedHashMap.put("Ram",87);
        linkedHashMap.put("Jitendra",90);
        linkedHashMap.put("Rakesh",70);
        linkedHashMap.put("Akash",22);
        linkedHashMap.put("Ramesh",27);
        linkedHashMap.put("Raju",95);
       // linkedHashMap.put(null , null); //Allowed
        System.out.println(linkedHashMap); // you can print which order you written

    }
}
