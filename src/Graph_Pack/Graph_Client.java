package Graph_Pack;

import java.util.HashSet;
import java.util.Scanner;

public class Graph_Client {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        Graph g = new Graph(v);
        for (int i = 0; i <v ; i++) {
            g.addVertex(i);
        }
        for (int i = 0; i <e ; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

        }

        g.addEdge(1 ,4 ,6);
        g.addEdge(1 ,2 ,10);
        g.addEdge(2 ,3 ,7);
        g.addEdge(3 ,4,5);
        g.addEdge(4 ,5,1);
        g.addEdge(5 ,6,4);
        g.addEdge(5 ,7,2);
        g.addEdge(6 ,7,3);

      // g.display();
        //g.removeEdge(4,5);
       // System.out.println();
        //g.display();
//        g.addVertex(9);
//        g.addEdge(1,9,8);
//        g.display();
        //System.out.println(g.containEdge(4,5));
        //System.out.println(g.hasPath(1 ,6 , new HashSet<Integer>()));
       // g.printAllPath(1,6 , new HashSet<>() , "");
       // System.out.println(g.BFS(1 ,6));
        System.out.println(g.DFS(1,6));
    }
}
