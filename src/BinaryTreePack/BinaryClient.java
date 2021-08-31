package BinaryTreePack;

public class BinaryClient {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.ht());
        System.out.println(bt.size());
     //   bt.preOrder();
      //  bt.postOrder();
      //  bt.inOrder();
       // bt.levelOrder();
        //bt.levelOrderWise();
        //bt.levelOrderWise2();
       // bt.zig_Zag();
        bt.zig_Zag2();

    }
}
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false