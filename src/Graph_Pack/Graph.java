package Graph_Pack;

import java.util.HashMap;

public class Graph {

    HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();

    public Graph(int v){
        for(int i =0;i<v;i++){
            map.put(i , new HashMap<>());
        }
    }
    public int noOfVertex(){
        return this.map.size();
    }
    public int noOfEdge(){
        int noOfedge = 0;

        for(int key : map.keySet()){
            noOfedge+=map.get(key).size();
        }
        return noOfedge / 2;
    }
    public void addVertex(int v){
        map.put(v , new HashMap<>());
    }
    public void addEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2 , cost); // v1-->v2 ,cost
        map.get(v2).put(v1 , cost); // v2-->12 ,cost
    }

    public boolean containEdge(int v1 , int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1); // if map's key v1 ke corrossnding jp map hai usme// v2 hai the return true and same this with v2

    }
    public boolean containVertex(int v1){
        return map.containsKey(v1); //if v1 present in key the return true

    }
    public void removeEdge(int v1 , int v2) {
        if (containEdge(v1, v2)) {
            map.get(v1).remove(v2); //get v1 key and remove crossponding hashmap v2
            map.get(v2).remove(v1);// get v2 key and remove crossponding hashmap v1
        }
    }
    public void removeVertex(int v1){
        map.remove(v1);
    }

}
