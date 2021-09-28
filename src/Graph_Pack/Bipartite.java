package Graph_Pack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    class Solution {

        class BipartitePair{
            int vt;
            int lv;

            public BipartitePair(int vt, int lv) {
                this.vt = vt;
                this.lv = lv;
            }
        }
        public boolean isBipartite(int[][] graph) {
            HashMap<Integer ,HashMap<Integer , Integer>> map = new HashMap<>();
            for(int i =0;i<graph.length;i++){
                map.put(i , new HashMap<>());
            }
            for(int i=0;i<graph.length;i++){
                for(int j= 0;j<graph[i].length ;j++){
                    int a = graph[i][j];
                    map.get(i).put(a , 1);
                }
            }
            Queue<BipartitePair> q = new LinkedList<>();
            HashMap<Integer , BipartitePair> visited = new HashMap<>();

            for (int src : map.keySet()) {
                if (visited.containsKey(src)) { //  if already visited then no need to run above code you can go for next iteration
                    continue;
                }

                BipartitePair p = new BipartitePair(src , 0);
                // add in q
                q.add(p);

                while (!q.isEmpty()) {
                    //Remove from Queue
                    BipartitePair rv = q.remove();

                    //ignore marks  3
                    if (visited.containsKey(rv.vt)) {      // if already visited then ignore
                        if(rv.lv!=visited.get(rv.vt).lv){ // if both's level not same then return false
                            return false;
                        }
                    }
                    //visited marks
                    visited.put(rv.vt , rv);
                    for (int nbrs : map.get(rv.vt).keySet()) {   // if not visited nbrs then add in q
                        if (!visited.containsKey(nbrs)) {
                            BipartitePair np = new BipartitePair(nbrs ,rv.lv+1);
                            q.add(np);
                        }
                    }

                }


            }
            return true;

        }
    }
}
