package BinaryTreePack;


import java.util.LinkedList;
import java.util.Scanner;

public class CreateTree_LevelOrder {
    Scanner sc = new Scanner(System.in);

    private class Node {
        int data;
        Node left; // left child
        Node right; //right child

    }

    private Node root;

    public CreateTree_LevelOrder() {
        this.root = createTree();

    }
    private Node createTree() {
        LinkedList<Node> queue = new LinkedList<>();
        int item = sc.nextInt(); //taking input for root
        Node node = new Node(); // create node
        node.data = item;//initialize data in node
        queue.add(node); //add node in queue

        while(!queue.isEmpty()){ // jab tak queue empty na ho jaye tab tak
            Node rv = queue.removeLast(); // remove node from queue

            int c1 = sc.nextInt(); // taking input for left node c1
            int c2 = sc.nextInt();// taking input for right node c2

            if(c1!=-1){ //if c1 -1 nhi hai tab
                Node nn = new Node();//dreate node for left
                nn.data = c1; //initialize data in left node
                nn.left = nn; // add node in left
                queue.add(node); // add in queue of left node
            }
            if(c2!=-1){ // same like c1 here also
                Node nn = new Node();
                nn.data = c2;
                nn.left = nn;
                queue.add(node);
            }
        }
        return root; // return root
    }



    public static void main(String args[]){
        CreateTree_LevelOrder ct = new CreateTree_LevelOrder();

    }
}
