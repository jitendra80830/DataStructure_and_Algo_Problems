package Graph_Pack;

public class Dijkastra_Client {
    public static void main(String[] args){
        Dijkastra_Algo da = new Dijkastra_Algo(7);
        da.addEdge(1,2,2);
        da.addEdge(2,3,3);
        da.addEdge(1,4,10);
        da.addEdge(3,4,1);
        da.addEdge(4,5,8);
        da.addEdge(5,6,5);
        da.addEdge(6,7,4);
        da.addEdge(5,7,6);
        da.Dijkastra_algorithm(1);
    }
}
