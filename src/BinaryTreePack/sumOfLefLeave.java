package BinaryTreePack;

public class sumOfLefLeave {
    private class Node {
        int data;
        Node left; // left child
        Node right; //right child

    }

    private Node root;
    int sum = 0;
    public int sumOfLeftLeaves(Node root) {
        if(root == null){
            return 0;

        }
        sumOfleftLeaveNode(root ,false);
        return sum;

    }
    public void sumOfleftLeaveNode(Node root , boolean isleft){
        if(isleft && root.left == null && root.right == null){
            sum+=root.data;
            return;
        }
        if(root.left!=null){
            sumOfleftLeaveNode(root.left,true);
        }
        if(root.right!=null){
            sumOfleftLeaveNode(root.right ,false);
        }
    }

}
