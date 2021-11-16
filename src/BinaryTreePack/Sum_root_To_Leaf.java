package BinaryTreePack;

public class Sum_root_To_Leaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int sumNumbers(TreeNode root) {
            return sumNumber1(root , 0);

        }
        public int sumNumber1(TreeNode root , int curr){
            if(root == null){ // if root hi nul hai to return null
                return 0;
            }
            if(root.left ==null && root.right == null){ // base case return if left and right is null the return curr*10+root.val;
                return curr*10+root.val;
            }
            int ls = sumNumber1(root.left , curr*10+root.val); // left call for left sum
            int rs = sumNumber1(root.right , curr*10+root.val); //  right call for right sum
            return ls + rs;

        }
    }
}
