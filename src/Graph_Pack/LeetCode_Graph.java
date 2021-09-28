package Graph_Pack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_Graph {

    class Solution{

        public boolean validTree(int n , int [][] edges){ //n = no of vertex
            HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();

            for(int i =0;i<n;i++){
                map.put(i , new HashMap<>());
            }
            for(int i =0;i<edges.length;i++){
                int a = edges[i][0]; // get int a column 0
                int b = edges[i][1];//  get in b column 1
                map.get(a).put(b , 1);
                map.get(b).put(a , 1);
            }
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            int count = 0;
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
                        return false;
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
            return count == 1;

        }
    }
}
