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
        for(int nbrs : map.get(scr).keySet()) { // nebours finding of src
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
    public void BFT() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) { //  if already visited then no need to run above code you can go for next iteration
                continue;
            }
            // add in q
            q.add(src);

            while (!q.isEmpty()) {
                //Remove from Queue
                int rv = q.remove();

                //ignore marks  3
                if (visited.contains(rv)) {      // if already visited then ignore
                    continue;
                }
                System.out.print(rv + " "); //  print that ele which removing from queue
                //visited marks
                visited.add(rv);
                for (int nbrs : map.get(rv).keySet()) {   // if not visited nbrs then add in q
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }


        }
    }
        public void  DFT(){
            Stack<Integer> s = new Stack<>();
            HashSet<Integer> visited = new HashSet<>();
            for(int src : map.keySet()) {
                if(visited.contains(src)){// if already visited then no need to run above code you can go for next iteration
                    continue;
                }

                // add in q
                s.push(src);

                while (!s.isEmpty()) {
                    //Remove from Queue
                    int rv = s.pop();
                    //ignore marks  3
                    if (visited.contains(rv)) {      // if already visited then ignore
                        continue;
                    }
                    System.out.print(rv + " ");
                    //visited marks
                    visited.add(rv);
                    for (int nbrs : map.get(rv).keySet()) {   // if not visited nbrs then add in q
                        if (!visited.contains(nbrs)) {
                            s.push(nbrs);
                        }
                    }

                }
            }
        }
    public boolean isCycle() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) { //  if already visited then no need to run above code you can go for next iteration
                continue;
            }
            // add in q
            q.add(src);

            while (!q.isEmpty()) {
                //Remove from Queue
                int rv = q.remove();

                //ignore marks  3
                if (visited.contains(rv)) {      // if already visited mens Cycle present
                    return true;
                }
                //visited marks
                visited.add(rv);
                for (int nbrs : map.get(rv).keySet()) {   // if not visited nbrs then add in q
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }


        }
        return false;
    }
    public boolean isConnected() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count =0;
        for (int src : map.keySet()) {
            if (visited.contains(src)) { //  if already visited then no need to run above code you can go for next iteration
                continue;
            }
            count++;
            // add in q
            q.add(src);


            while (!q.isEmpty()) {
                //Remove from Queue
                int rv = q.remove();

                //ignore marks  3
                if (visited.contains(rv)) {      // if already visited then ignore
                    continue;
                }
                //visited marks
                visited.add(rv);
                for (int nbrs : map.get(rv).keySet()) {   // if not visited nbrs then add in q
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }

        }
       return count == 1;
    }
    public ArrayList<ArrayList<Integer>> GetAll_Component() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        int count =0;
        for (int src : map.keySet()) {
            if (visited.contains(src)) { //  if already visited then no need to run above code you can go for next iteration
                continue;
            }
            count++;
            ArrayList<Integer> list = new ArrayList<>();
            // add in list
            q.add(src); //add in list


            while (!q.isEmpty()) {
                //Remove from Queue
                int rv = q.remove();

                //ignore marks  3
                if (visited.contains(rv)) {      // if already visited then ignore
                    continue;
                }
                //visited marks
                visited.add(rv);
                list.add(rv);
                for (int nbrs : map.get(rv).keySet()) {   // if not visited nbrs then add in list
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
            ans.add(list);//add in 2D list

        }
        return ans; // return 2D list
    }
    public boolean isTree(){
        return (!isCycle()) && isConnected();
    }
    public void kruskal(){
        Disjoint_Set_Union ds = new Disjoint_Set_Union();
        for(int keys : map.keySet()){
            ds.create(keys); // creating node of this keys(val)
        }
        ArrayList<Edges> list = getAllEdge(); // geting all edges

        Collections.sort(list);
        for(int i=0;i<list.size() ;i++){
            Edges eg = list.get(i);
            int r1 =ds.find(eg.vt1);
            int r2 = ds.find(eg.vt2);

            if(r1== r2){
                //Nothing do
            }else {
                System.out.println(eg);
                ds.union(r1 ,r2);
            }
        }
    }

    public ArrayList<Edges> getAllEdge(){ // for get all edges
        ArrayList<Edges> ans = new ArrayList<>();
        for(int key : map.keySet()){ // get keysets of map

            for (int nbrs : map.get(key).keySet()){ //  get keysets's crosponding map's keysets is called nbrs
                Edges edges = new Edges(key , nbrs , map.get(key).get(nbrs));  // cost = key ke crosponding nbrs's cost

                ans.add(edges); // add in arraylist
            }
        }
        return ans;

    }
    public class Edges implements Comparable<Edges>{ // for b/w two edged min cost
        int vt1;
        int vt2;
        int cost;

        public Edges(int vt1 , int vt2 , int cost){
            this.vt1 = vt1;
            this.vt2 = vt2;
            this.cost = cost;
        }
        public String toString(){
            return this.vt1+"--->"+this.vt2+" @ "+this.cost;
        }

        public int compareTo(Edges o) {
            return this.cost - o.cost;
        }
    }
    public class PrimsPiars implements  Comparable<PrimsPiars>{
        int vt;
        int acqvt;
        int cost;

        public PrimsPiars(int vt ,int acqvt ,int cost){
            this.vt = vt;
            this.acqvt = acqvt;
            this.cost = cost;
        }
        public String toString(){
            return vt+" --> "+acqvt+" @ "+cost;
        }

        @Override
        public int compareTo(PrimsPiars o) {
            return this.cost - o.cost;
        }
    }
    public void prims(){
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<PrimsPiars> q = new PriorityQueue<>();

        q.add(new PrimsPiars(1,1,0)); //add 1st vertex in priority queue

        while (!q.isEmpty()){
            PrimsPiars rv = q.remove(); // removing from pq

            if(visited.contains(rv.vt)){ // if allready visited then ignore and go for next iteretion
                continue;
            }
            visited.add(rv.vt); // marking visited
            System.out.println(rv); // print removing's rv
            for(int nbrs : map.get(rv.vt).keySet()){ //get noubers of vt's keysets
                if(!visited.contains(nbrs)){  // if not contains in visited then
                    PrimsPiars p = new PrimsPiars(nbrs ,rv.vt ,map.get(rv.vt).get(nbrs));
                    q.add(p); ///add in pq
                }

            }
        }
    }
}
