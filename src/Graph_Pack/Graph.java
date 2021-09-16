package Graph_Pack;

import java.util.*;

public class Graph {

    HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();

    public Graph(int v){
        for(int i =1;i<=v;i++){
            map.put(i , new HashMap<>());
        }
    }
    public int noOfVertex(){
        return this.map.size();
    }
    public int noOfEdge(){
        int noOfedge = 0;

        for(int key : this.map.keySet()){
            noOfedge+=map.get(key).size();
        }
        return noOfedge / 2;
    }
    public void addVertex(int v){
        map.put(v , new HashMap<>()); //add new hashmap crossponding key v
    }
    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);// v1-->v2,cost
        map.get(v2).put(v1, cost);// v2-->v1,cost

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
        for(int nbrs : map.get(v1).keySet()){ // get key and crossponding key set  of hashmap
            map.get(nbrs).remove(v1); //after that remove that ke v1

        }
        map.remove(v1);

    }
    public void display(){
        for(int key : map.keySet()){
            System.out.println(key+" --> "+map.get(key));
        }
    }
    public boolean hasPath(int scr , int dis , HashSet<Integer> visited){
        if(scr == dis){ // if src == dis then return true
            return true;
        }
        visited.add(scr); // add visited
        for(int nbrs : map.get(scr).keySet()) { // nebours finding
            if (!visited.contains(nbrs)) { // if not already visited then go ahead
                boolean isPath = hasPath(nbrs, dis, visited);
                if (isPath) {
                    return isPath;
                }
            }
        }
        return false;
    }
    public void printAllPath(int scr , int dis , HashSet<Integer> visited , String str){
        if(scr == dis){ // if src == dis then return true
            System.out.println(str + dis);
            return;
        }
        visited.add(scr); // add visited
        for(int nbrs : map.get(scr).keySet()) { // nebours finding
            if (!visited.contains(nbrs)) { // if not already visited then go ahead
                 printAllPath(nbrs, dis, visited , str + scr);

            }
        }
        visited.remove(scr);

    }
    public boolean BFS(int src , int dis){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

         // add in q
        q.add(src);

        while (!q.isEmpty()){
            //Remove from Queue
            int rv = q.remove();
            if(rv == dis){
                return true;
            }
            //ignore marks  3
            if(visited.contains(rv)){      // if already visited then ignore
                continue;
            }
            //visited marks
            visited.add(rv);
            for(int nbrs : map.get(rv).keySet()){   // if not visited nbrs then add in q
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }

        }
        return false;

    }
    public boolean DFS(int src , int dis){
        Stack<Integer> s = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        // add in q
        s.push(src);

        while (!s.isEmpty()){
            //Remove from Queue
            int rv = s.pop();
            if(rv == dis){
                return true;
            }
            //ignore marks  3
            if(visited.contains(rv)){      // if already visited then ignore
                continue;
            }
            //visited marks
            visited.add(rv);
            for(int nbrs : map.get(rv).keySet()){   // if not visited nbrs then add in q
                if(!visited.contains(nbrs)){
                    s.push(nbrs);
                }
            }

        }
        return false;

    }



}
