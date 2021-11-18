package BinaryTreePack;

public class SumPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null){ // if null hi null hai to return false
                return false;
            }
            //if root ka left and right node null hai and jo target value hai
            // usme se root ka value minus krke if 0 aata hai to means tatget mil gaya hai return true ok
            if(root.left == null && root.right == null && targetSum - root.val == 0){
                return true;
            }
            boolean lp = hasPathSum(root.left , targetSum - root.val);
            boolean rp = hasPathSum(root.right , targetSum - root.val);
            return lp || rp;


        }
    }
}
