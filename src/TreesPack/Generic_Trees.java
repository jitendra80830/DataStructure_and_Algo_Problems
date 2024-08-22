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
        if (parent == null) { // if parent is null then inter data for parent
            System.out.println("Enter a data for root Node");
        } else {
            System.out.println("Enter the data for " + ith + " ith child of " + parent.data);// if parent is not null then inter data for child
        }
        int item = sc.nextInt();//data of node
        Node nn = new Node();//creating new node
        nn.data = item;
        System.out.println("No of child of "+nn.data);
        int noc  = sc.nextInt(); // for no of child inserting
        for(int i = 0;i<noc;i++){ // loop for how many no of child noc then for that child will go call fun
            Node child = create_Tree(nn , i);
            nn.children.add(child);
        }
        return nn;//return root node here
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str = "";
        str+=node.data+"->";
        for (Node child : node.children){// loop for root's child
            str+=child.data+" ,"; // adding in string of root's child
        }
        str+=".";
        System.out.println(str);
        for (Node child : node.children){//again recursive call for that's all child
            display(child);
        }
    }
    public int size(){
        return size(this.root);
    }
    private int size(Node node){
        int ts = 0;
        for(Node child : node.children){ // loop for child's size
            ts+=size(child); // add in ts all child
        }
        return ts +1; //1 for parent size
    }
    public boolean find(int item){
        return find(this.root , item);
    }

    private boolean find(Node node, int item) {
        if(node.data == item){ // if node's data == item then true
            return true;
        }
        for(Node child : node.children){ // again for child
            boolean ans = find(child , item); // recursive calls
            if(ans){
                return true; // if true at any node the return true
            }
        }
        return false; //nhi to false
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
        for(Node child : node.children){ // loop for root's child
            th = Math.max(th , ht(child)); //here max of th and recursive call that's child's  ht
        }
        return th + 1;// 1 for a single node's height
    }
    public void preOrder(){
        preOrder(this.root); //root
        System.out.println();
    }

    private void preOrder(Node node) {
        System.out.print(node.data+" "); // 1st print node then call usake child node and again print
        for(Node child : node.children){
            preOrder(child);
        }
    }
    public void postOrder(){
        postOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node node) {

        for (Node child : node.children){ // 1st call child node then print child
            postOrder(child);
        }
        System.out.print(node.data+" "); //print child node
    }
    public void linearTree(){
        linearTree(this.root); //passing root node
    }

    private void linearTree(Node node) {
        for(Node child : node.children){ // for linear of child
            linearTree(child); // using recursive call
        }
        while (node.children.size() > 1) { // jab children la size >1 ho then go
            Node tailNode = getTailNode(node.children.get(0));  //get tail node ( 0 child) of node
            Node firstNode = node.children.remove(1);//1st node removing of tree
            tailNode.children.add(firstNode); // add 1st node in last(tail node) me
        }
    }

    private Node getTailNode(Node node) {
        if(node.children.size() == 0){ //if child is 0 then means this is tail node
            return node; //return tail node
        }
        for (Node child : node.children){ // otherwise call hoga uske child ka jab tak tail node na mil na jaye
            getTailNode(child);
        }
        return null;
    }
}
