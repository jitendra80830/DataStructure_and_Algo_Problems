package BinaryTreePack;

import java.util.*;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    private class Node {
        int data;
        Node left; // left child
        Node right; //right child

    }

    private Node root;

    public BinaryTree() {
        this.root = createTree(null, false);

    }

    private Node createTree(Node parent, boolean ilc) {
        if (parent == null) {
            System.out.println("Enter a data for root node");
        } else {
            if (ilc) { //if true
                System.out.println("Enter a data for left child of " + parent.data);
            } else { //if false
                System.out.println("Enter a data for right child of " + parent.data);
            }
        }
        int item = sc.nextInt();//Enter a data for root node
        Node nn = new Node();//create node
        nn.data = item;//asign data in  node
        System.out.println("has a left child ?? " + nn.data);
        boolean hlc = sc.nextBoolean(); //enter true or false for left child
        if (hlc) {
            nn.left = createTree(nn, true); //pass two arrg node and true
        }
        System.out.println("has a right child ?? " + nn.data);//enter true or false for right child
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree(nn, false);//pass two arrg node and true
        }
        return nn;

    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) { // if node is null
            return;
        }

        String str = "";
        if (node.left != null) {//if left  child not null
            str += node.left.data;
        } else {
            str += ".";// if left child is null
        }
        str += "<-- " + node.data + " -->";
        if (node.right != null) { //if right  child not null
            str += node.right.data;
        } else {
            str += "."; // if right child is null
        }
        System.out.println(str); //print string
        display(node.left); //  recursion call for again above work for left child
        display(node.right);// recursion call for again above work for right child
    }

    public int max() {
        return max(this.root);

    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int left_max = max(node.left); //call for left max on each node
        int right_max = max(node.right); // call for right max on each  node

        return Math.max(left_max, Math.max(right_max, node.data));// max in right and and root data
    }

    public int ht() {
        return ht(this.root);
    }

    private int ht(Node node) {
        if (node == null) {
            return -1;
        }

        int left_ht = ht(node.left);
        int right_ht = ht(node.right);

        return Math.max(left_ht, right_ht) + 1;
    }

    public int size() {
        return size(this.root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        int left_size = size(node.left); // for left child size
        int right_size = size(node.right);// for right child size

        return left_size + right_size + 1; // add both and plus 1 for root node
    }

    public void preOrder() {
        preOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " ");
    }

    public void inOrder() {
        inOrder(this.root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>(); //queue
        q.add(this.root);//add in queue root node
        while (!q.isEmpty()) {//jab tal empty nhi ho
            Node node = q.remove();//remove from queue
            System.out.print(node.data + " ");//print data which you removed from queue
            if (node.left != null) {
                q.add(node.left);//add left node in queue if not null left child
            }
            if (node.right != null) {
                q.add(node.right);//add right node in queue if not null right child
            }
        }
        System.out.println();
    }

    public void levelOrderWise() {
        Queue<Node> q = new LinkedList<>(); //queue
        q.add(this.root);//add in queue root node
        while (!q.isEmpty()) {//jab tal empty nhi ho
            int size = q.size();
            while (size > 0) {
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

    public void levelOrderWise2() {
        Queue<Node> p = new LinkedList<>();//primary
        Queue<Node> h = new LinkedList<>();//helper
        p.add((this.root)); // root adding in primary
        while (!p.isEmpty()) {
            Node node = p.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                h.add(node.left); // but left child adding in helper
            }
            if (node.right != null) {
                h.add(node.right); // but right child adding in helper
            }
            if (p.isEmpty()) {//if primary empty ho gya then primary point krega helper ko and helper new create hoga
                p = h;   //then p will point to helper and helper create new queue
                System.out.println();//change the line after printing from primary
                h = new LinkedList<>();
            }
        }
    }

    public void zig_Zag() {
        Queue<Node> q = new LinkedList<>(); //queue
        q.add(this.root);//add in queue root node
        int level =0;
        while (!q.isEmpty()) {//jab tal empty nhi ho
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size > 0) {

                Node node = q.remove();//remove from queue
                //System.out.print(node.data + " ");//print data which you removed from queue
                list.add(node.data);
                if (node.left != null) {
                    q.add(node.left);//add left node in queue if not null left child
                }
                if (node.right != null) {
                    q.add(node.right);//add right node in queue if not null right child
                }
                size--;
            }
            if(level%2==0){ // if level is even then print
                System.out.println(list);
            }else {
                Collections.reverse(list); //but if level is odd then printer after reverse
                System.out.println(list);
            }
            level++;
        }
    }
    public void zig_Zag2() {
        Queue<Node> q = new LinkedList<>(); //queue
        Stack<Node> s= new Stack<>();
        boolean ltr = false;
        q.add(this.root);//add in queue root node

        while (!q.isEmpty()) {//jab tal empty nhi ho
            int size = q.size();

            while (size > 0) {

                Node node = q.remove();//remove from queue
                if(ltr==true){
                    System.out.print(node.data + " ");//print data which you removed from queue
                }else {
                    s.push(node);
                }
                if (node.left != null) {
                    q.add(node.left);//add left node in queue if not null left child
                }
                if (node.right != null) {
                    q.add(node.right);//add right node in queue if not null right child
                }
                size--;
                if (ltr == false)
                {
                    while (!s.empty())
                    {
                        node = s.peek();
                        s.pop();
                        System.out.println(node.data+" ");
                    }
                }
                ltr = !ltr;
            }
        }
    }
    public int diameterOfBinaryTree(){
        return diameterOfBinaryTree(this.root);
    }

    private int diameterOfBinaryTree(Node node) {
        if(node == null){
            return 0;
        }

        int ld = diameterOfBinaryTree(node.left); // find left diameter
        int rd = diameterOfBinaryTree(node.right); // find right diameter
        int sd = ht(node.left) + ht(node.right) + 2; // find self diameter(root's) = left ka ht abd right ka ht + 2 for root's two left and right stick
        return Math.max(sd , Math.max(ld , rd)); //Max of self diameter and Max of left and right diameter
    }
    public class DiaPair{
        int ht = -1;
        int dia = 0;
    }
    public DiaPair diameterOfBinaryTree2(Node node){
        if(node == null){
            return new DiaPair(); // if node is null then return ht=-1 and dia =0 in base case
        }
        DiaPair ldp = diameterOfBinaryTree2(node.left);
        DiaPair rdp = diameterOfBinaryTree2(node.right);
        DiaPair sdp = new DiaPair();
        int sd = ldp.ht + rdp.ht +2;
        int ht = Math.max(ldp.ht , rdp.ht)+1;
        sdp.dia = Math.max(ldp.dia ,Math.max(rdp.dia , sd));
        sdp.ht = ht;
        return sdp;
    }
    public boolean isBalanceTree(Node node){ // if 0,1,-1 node pe hai to tree is balanced
        if(node == null){
            return true;
        }
        boolean lb = isBalanceTree(node.left); // for lft balance
        boolean rb = isBalanceTree(node.right);// for right balance

        int sb = Math.abs(ht(node.left) - ht(node.right)); // hit of left's - right's node
        return lb && rb && sb<=1;
    }
    public class isBalanced{
        int hit = -1;
        boolean bal = true;
    }
    //optimize
    public isBalanced isBalanceTree2(Node node){
        if(node == null){
            return new isBalanced();// if node is null then return ht=-1 and bal =true in base case
        }

        isBalanced lbp = isBalanceTree2(node.left); // for lft balance pair
        isBalanced rbp = isBalanceTree2(node.right);// for rgt balance pair
        isBalanced sbp = new isBalanced(); // for self balance pair
        int sb  = Math.abs(lbp.hit - rbp.hit); // self balance
        sbp.hit = Math.max(lbp.hit , rbp.hit) + 1; //  sbp ka hit
        sbp.bal = (lbp.bal && rbp.bal && sb<=1);// sbp ka bal checking if true or not
        return sbp; // return self balance pair
    }
    public static Node lowestCommonAncester(Node root , Node p , Node q){
        if(root==null){ //  if root is null
            return null;
        }
        if(root == p || root == q){ //  if root ==p and root ==q then return root
            return root;
        }
        Node left = lowestCommonAncester(root.left , p ,q); // call for left
        Node right = lowestCommonAncester(root.right ,p ,q); // call for right
        if(left!=null && right!=null){ // if left !=null and right != null then return
            return root;
        }
        else if(left!=null && right==null){ //if left !=null and right == null then return left
            return left;
        }
        else if(left==null && right!=null){ //if left ==null and right != null then return right
            return right;
        }
        else{ // if left ==null and right == null
            return right;
        }

    }
    public static Node lowestCommonAncester2(Node root , Node p , Node q) {
        if(p == null || q==null){
            return null;
        }
        if (root == null) { //  if root is null
            return null;
        }
        if (root == p || root == p) { //  if root ==p and root ==q then return root
            return root;
        }
        Node left = lowestCommonAncester2(root.left, p, q); // call for left
        Node right = lowestCommonAncester2(root.right, p, q); // call for right
        if (left != null && right != null) { // if left !=null and right != null then return
            return root;
        } else if (left != null && right == null) { //if left !=null and right == null then return left
            return left;
        } else if (left == null && right != null) { //if left ==null and right != null then return right
            return right;
        } else { // if left ==null and right == null
            return right;
        }
    }
    public  Node lowestCommonAncesterval(Node root , int p , int q){
        if(root==null){ //  if root is null
            return null;
        }
        if(root.data == p || root.data == q){ //  if root ==p and root ==q then return root
            return root;
        }
        Node left = lowestCommonAncesterval(root.left , p ,q); // call for left
        Node right = lowestCommonAncesterval(root.right ,p ,q); // call for right
        if(left!=null && right!=null){ // if left !=null and right != null then return
            return root;
        }
        else if(left!=null && right==null){ //if left !=null and right == null then return left
            return left;
        }
        else if(left==null && right!=null){ //if left ==null and right != null then return right
            return right;
        }
        else{ // if left ==null and right == null
            return right;
        }

    }

    static boolean isSumTree(Node node)
    {
        int ls,rs;


        if(node == null || (node.left == null && node.right == null))
        {
            return true;
        }


        // return sum left and right data
        ls = sum(node.left);
        rs = sum(node.right);


        if((node.data == ls + rs) && isSumTree(node.left) != false && isSumTree(node.right) != false) // id stasified condition return true
        {
            return true;
        }
        return false;
    }


    static int sum(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        return (sum(node.left) + node.data+sum(node.right)); // return root data and left and right
    }
    int findDistincVal(){
        return findDistinctCount(root);
    }
    int findDistinctCount(Node node) {
        //write your code here
        HashMap<Long,Integer> hash = new HashMap<Long,
                Integer>();
        return printt(node,hash);
    }
    static int printt(Node node, HashMap<Long,Integer> m) {
        if (node == null)
            return m.size();

        if(m.containsKey(node.data))

        {
            m.put((long) node.data, m.get(node.data) + 1);
        }
        else
        {
            m.put((long) node.data, 1);
        }

        int max_path = Math.max(printt(node.left, m),
                printt(node.right, m));
        if(m.containsKey(node.data)) {

            m.put((long) node.data, m.get(node.data) - 1);
        }

        if (m.get(node.data) == 0)
            m.remove(node.data);
        return max_path;
    }
    int maximumTurns(Node node){
        return Math.max(leftTunrs(node.left ,0) , rightTurns(node.right , 0));
    }

    private int rightTurns(Node node, int turns) {
        if(node == null){
            return 0;
        }
        return turns+=Math.max(leftTunrs(node.left ,1) ,rightTurns(node.right ,0));

    }

    private int leftTunrs( Node node, int turns) {
        if(node == null){
            return 0;
        }
        return turns+=Math.max(leftTunrs(node.left , 0) ,rightTurns(node.right , 1));
    }
    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }
        if(p ==null || q == null){
            return false;
        }
       if( p.data!=q.data){
           return false;
       }

       boolean leftN = isSameTree(p.left ,q.left);
       boolean rightN = isSameTree(p.right , q.right);
       if(leftN && rightN){
           return true;
       }else {
           return false;
       }


    }


}
