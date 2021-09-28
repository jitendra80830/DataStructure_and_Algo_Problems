package Graph_Pack;

import javax.swing.tree.AbstractLayoutCache;
import java.util.HashMap;

public class Disjoint_Set_Union {

    public class Node{
        int data;
        Node parent;
        int rank;

    }
    HashMap<Integer , Node> dsu = new HashMap<>();
    public void create(int val){
        Node node = new Node();
        node.parent = node;
        node.data = val;
        node.rank = 0;
        dsu.put(val , node); // put values and its  crosspondig node
    }
    public int find(int val){
        Node node = dsu.get(val); // get node of that's value
        return find(node).data; //return data of node which i am finding
    }

    private Node find(Node node) { // find node
        if(node.parent == node){ // if node is parent node then return
            return node;
        }
        Node nn = find(node.parent); // otherwise call node until find parent node and return in nn
        node.parent = nn; // making 11's parent 1 (Path Compression)
        return nn; ///and return 1 (parent)
    }
    public void union(int val1 , int val2){
        Node n1 = find(dsu.get(val1)); // get node of val1 in n1
        Node n2 = find(dsu.get(val2)); // get node of val2 in n2

        if(n1.rank == n2.rank){ // if n1'rank == n2's rank then
            n1.parent = n2; // making n1's parent n2
            n2.rank++; // 1 increase rank of parent
        }
        else if(n1.rank > n2.rank){
            n2.parent = n1; // makes n2's parent n1
        }
        else {
            n1.parent = n2; //  otherwise makes n1's parent n2
        }
    }
}
