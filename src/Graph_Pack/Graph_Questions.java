package Graph_Pack;

public class Graph_Questions {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(5, 7, 2);
        //g.addEdge(6 ,7,3);
//        g.addVertex(9);
//        g.BFT();
//        System.out.println();
//        g.DFT();
//        System.out.println();
        System.out.println(g.isCycle());
        System.out.println(g.isConnected());
        //System.out.println(g.GetAll_Component());
        System.out.println(g.isTree());
    }
}
