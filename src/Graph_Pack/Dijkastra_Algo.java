package Graph_Pack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkastra_Algo {

    HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();

    public Dijkastra_Algo(int v){
        for(int i=1;i<=v;i++){
            map.put(i , new HashMap<>());
        }
    }
    public void addEdge(int v1 ,int v2 , int cost){
        map.get(v1).put(v2 , cost);
        map.get(v2).put(v1 , cost);
    }
    public class DijkastraPair implements  Comparable<DijkastraPair>{
        int vt;
        String psf;
        int cost;

        public DijkastraPair(int vt , String psf , int cost){
            this.vt = vt;
            this.psf = psf;
            this.cost = cost;
        }
        public String toString(){
            return this.vt+" path "+this.psf+" cost "+this.cost;
        }

        @Override
        public int compareTo(DijkastraPair o) {
            return this.cost - o.cost;
        }
    }
    public void Dijkastra_algorithm(int scr){
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<DijkastraPair> pq = new PriorityQueue<>();

        DijkastraPair dj = new DijkastraPair(scr , ""+scr , 0);
         //add src in pq(ist vt 1)
        pq.add(dj);

        while (!pq.isEmpty()){

            //remove from pq
            DijkastraPair rp = pq.remove();

            //ignore
            if(visited.contains(rp.vt)){
                continue;
            }
            System.out.println(rp);

            //visited mark
            visited.add(rp.vt);

            //add nbrs in pq
            for(int nbrs : map.get(rp.vt).keySet()){
                if(!visited.contains(nbrs)){
                    DijkastraPair np = new DijkastraPair(nbrs ,rp.psf+nbrs , rp.cost+map.get(rp.vt).get(nbrs));// (rp.cost+map.get(rp.vt).get(nbrs))get remove's cost and get that's crosponding hasmap and get that's nebs' cost

                    pq.add(np);
                    }
                }
            }
        }

    }
