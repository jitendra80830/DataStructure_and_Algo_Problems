package Graph_Pack;

public class Kruskal_Graph {
    public static void main(String[] args){
        Graph g = new Graph(7);
        g.addEdge(1,2,1);
        g.addEdge(2,3,3);
        g.addEdge(1,4,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,8);
        g.addEdge(5,6,2);
        g.addEdge(6,7,4);
        g.addEdge(5,7,6);
        //g.kruskal();
        g.prims();
    }
}
