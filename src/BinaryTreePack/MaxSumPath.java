package BinaryTreePack;

public class MaxSumPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public int maxPathSum(TreeNode root) {
            HeapMover mover = new HeapMover();
            maxPathSum1(root , new HeapMover());
            return mover.results;

        }
        public class HeapMover{
            int results = Integer.MIN_VALUE;
        }
        public int maxPathSum1(TreeNode root , HeapMover mover){
            if (root == null){
                return 0;
            }

            int l = maxPathSum1(root.left ,mover);
            int r = maxPathSum1(root.right,mover);
            int sp = Math.max(Math.max(l ,r) + root.val , root.val); // straight path if root react as mid node and if all node's negative value
            int rp = Math.max(r + l + root.val , sp);// root path if root react as root node and max of rp and sp in rp
            mover.results = Math.max(rp , mover.results); // updating res value in res max rp and res values
            return sp; // return sp for straight path

        }
    }
}
