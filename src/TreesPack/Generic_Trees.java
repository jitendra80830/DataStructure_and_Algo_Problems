package TreesPack;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_Trees {
    Scanner sc = new Scanner(System.in);

    private class Node {
        int data;
        ArrayList<Node> children;

        public Node() {
            this.children = new ArrayList<>();
            this.data = 0;

        }

    }

    Node root;

    public Generic_Trees() {
        this.root = create_Tree(null, -1);

    }

    public Node create_Tree(Node parent, int ith) {
        if (parent == null) {
            System.out.println("Enter a data for root Node");
        } else {
            System.out.println("Enter the data for " + ith + " ith child of " + parent.data);
        }
        int item = sc.nextInt();//data of node
        Node nn = new Node();//node
        nn.data = item;
        System.out.println("No of child of "+nn.data);
        int noc  = sc.nextInt();
        for(int i = 0;i<noc;i++){
            Node child = create_Tree(nn , i);
            nn.children.add(child);
        }
        return nn;
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str = "";
        str+=node.data+"->";
        for (Node child : node.children){
            str+=child.data+" ,";
        }
        str+=".";
        System.out.println(str);
        for (Node child : node.children){
            display(child);
        }
    }
    public int size(){
        return size(this.root);
    }
    private int size(Node node){
        int ts = 0;
        for(Node child : node.children){
            ts+=size(child);
        }
        return ts +1;
    }
    public boolean find(int item){
        return find(this.root , item);
    }

    private boolean find(Node node, int item) {
        if(node.data == item){
            return true;
        }
        for(Node child : node.children){
            boolean ans = find(child , item);
            if(ans){
                return true;
            }
        }
        return false;
    }
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        int max = node.data;
        for(Node child : node.children){
            int curr_max = max(child);
            max = Math.max(curr_max , max);
        }
        return max;
    }
    public int ht(){
        return ht(this.root);
    }

    private int ht(Node node) {
        int th = 0;
        for(Node child : node.children){
            th = Math.max(th , ht(child));
        }
        return th + 1;
    }
    public void preOrder(){
        preOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node node) {
        System.out.print(node.data+" ");
        for(Node child : node.children){
            preOrder(child);
        }
    }
    public void postOrder(){
        postOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node node) {

        for (Node child : node.children){
            postOrder(child);
        }
        System.out.print(node.data+" ");
    }
    public void linearTree(){
        linearTree(this.root);
    }

    private void linearTree(Node node) {
        for(Node child : node.children){
            linearTree(child);
        }
        while (node.children.size() > 1) {
            Node tailNode = getTailNode(node.children.get(0)); //get tail node ( 0 child) of node
            Node firstNode = node.children.remove(1);//1st node remove
            tailNode.children.add(firstNode); // add 1st node in last(tail node)
        }
    }

    private Node getTailNode(Node node) {
        if(node.children.size() == 0){
            return node; //return tail node
        }
        for (Node child : node.children){
            getTailNode(child);
        }
        return null;
    }
}
