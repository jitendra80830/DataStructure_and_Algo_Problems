package Graph_Pack;

public class Bellman_Client {
    public static void main(String[] args){
        Bellman_Ford b = new Bellman_Ford(5);
        b.addEdge(1,2,8);
        b.addEdge(1,3,4);
        b.addEdge(1,4,5);
        b.addEdge(2,5,-2);
        b.addEdge(3,4,-3);
        b.addEdge(4,5,4);
        b.addEdge(5,2,1);
        b.bellManFord(1);
    }
}
