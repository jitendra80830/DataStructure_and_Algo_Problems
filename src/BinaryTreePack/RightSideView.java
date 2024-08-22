package BinaryTreePack;

import StackPck.StockSpan;

public class RightSideView {
    private class Node {
        int data;
        Node left; // left child
        Node right; //right child

    }

    private Node root;

    public void rightView() {
        rightSideView(this.root , -1 , new HeapMover());

    }
    public class HeapMover{
        int visited = -1;
    }

    private void rightSideView(Node node , int curr_level  , HeapMover mover) {
        if(node == null){
            return;
        }
        if(mover.visited < curr_level) {
            System.out.print(node.data + " ");
            mover.visited = curr_level;
        }
        rightSideView(node.right ,curr_level+1 , mover);
        rightSideView(node.left ,curr_level+1 , mover);

    }
}
