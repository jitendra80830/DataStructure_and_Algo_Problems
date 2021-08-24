package BinaryTreePack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);
    private class Node{
         int data;
         Node left;
         Node right;

    }
    private Node root;
    public BinaryTree(){
        this.root = createTree(null , false);

    }

    private Node createTree(Node parent,boolean ilc) {
        if(parent == null){
            System.out.println("Enter a data for root node");
        }else {
            if(ilc) { //if true
                System.out.println("Enter a data for left child of "+ parent.data);
            }else { //if false
                System.out.println("Enter a data for right child of "+ parent.data);
            }
        }
        int item = sc.nextInt();//Enter a data for root node
        Node nn = new Node();//create node
        nn.data = item;//asign data in  node
        System.out.println("has a left child ?? "+nn.data);
        boolean hlc = sc.nextBoolean(); //enter true or false for left child
        if(hlc){
            nn.left = createTree(nn , true); //pass two arrg node and true
        }
        System.out.println("has a right child ?? "+nn.data);//enter true or false for right child
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = createTree(nn , false);//pass two arrg node and true
        }
        return nn;

    }
    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        if(node==null){ // if node is null
            return;
        }

        String str = "";
        if(node.left!=null){//if left  child not null
            str+=node.left.data;
        }else {
            str+=".";// if left child is null
        }
        str+="<-- "+node.data+" -->";
        if(node.right!=null){ //if right  child not null
            str+=node.right.data;
        }else {
            str+="."; // if right child is null
        }
        System.out.println(str); //print string
        display(node.left); //  recursion call for again above work for left child
        display(node.right);// recursion call for again above work for right child
    }
    public int max(){
        return max(this.root);

    }

    private int max(Node node) {
        if (node == null){
            return Integer.MIN_VALUE;
        }
        int left_max = max(node.left); //call for left max on each node
        int right_max = max(node.right); // call for right max on each  node

        return Math.max(left_max , Math.max(right_max , node.data));// max in right and and root data
    }
    public int ht(){
        return ht(this.root);
    }

    private int ht(Node node) {
        if(node == null){
            return -1;
        }

        int left_ht = ht(node.left);
        int right_ht = ht(node.right);

        return Math.max(left_ht, right_ht)+1;
    }
   public int size(){
        return size(this.root);
   }

    private int size(Node node) {
        if(node == null){
            return 0;
        }
        int left_size = size(node.left); // for left child size
        int right_size = size(node.right);// for right child size

        return left_size+right_size+1; // add both and plus 1 for root node
    }
    public void preOrder(){
        preOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(){
        postOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if(node ==  null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data+" ");
    }
    public void inOrder(){
        inOrder(this.root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void levelOrder(){
        Queue<Node> q = new LinkedList<>(); //queue
        q.add(this.root);//add in queue root node
        while (!q.isEmpty()){//jab tal empty nhi ho
            Node node = q.remove();//remove from queue
            System.out.print(node.data+" ");//print data which you removed from queue
            if(node.left!=null){
                q.add(node.left);//add left node in queue if not null left child
            }
            if(node.right!=null){
                q.add(node.right);//add right node in queue if not null right child
            }
        }
        System.out.println();
    }
    public void levelOrderWise(){
        Queue<Node> q = new LinkedList<>(); //queue
        q.add(this.root);//add in queue root node
        while (!q.isEmpty()){//jab tal empty nhi ho
            int size = q.size();
            while (size>0) {
                Node node = q.remove();//remove from queue
                System.out.print(node.data + " ");//print data which you removed from queue
                if (node.left != null) {
                    q.add(node.left);//add left node in queue if not null left child
                }
                if (node.right != null) {
                    q.add(node.right);//add right node in queue if not null right child
                }
                size--;
            }
            System.out.println();
        }

    }
}
