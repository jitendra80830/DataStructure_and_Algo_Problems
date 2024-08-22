package Graph_Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Bellman_Ford {
    HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();

    public Bellman_Ford(int v){
        for(int i=1;i<=v;i++){
            map.put(i , new HashMap<>());
        }
    }
    public void addEdge(int v1 ,int v2 , int cost){
        map.get(v1).put(v2 , cost); //Directed Graph
    }

    public class Edges { // for b/w two edged min cost
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
    public void bellManFord(int scr){
        int v = this.map.size();

        int dis[] = new int[v+1];

        ArrayList<Edges> egeList = getAllEdge(); //get all edges
        Arrays.fill(dis , 1000000); // for max values


        dis[scr] = 0; // fill 0 in 0 index
        for(int i =1;i<=v;i++){ // relaxing
            for(Edges eg : egeList){
                int v1 = eg.vt1;//v1
                int v2 = eg.vt2;//v2
                int c = eg.cost;//cost

                if(dis[v2] > dis[v1] + c){ //if v2's cost > v1's cost+v1-->v2 ka cost then
                    if(i<v){
                    dis[v2] = dis[v1] + c; // updating v1's values
                    }else {
                        System.out.println("-v cycle");
                        return;
                    }
                }
            }
        }
        for(int i=1;i<dis.length;i++){ //printing
            System.out.println(i+" "+dis[i]);
        }

    }

}
