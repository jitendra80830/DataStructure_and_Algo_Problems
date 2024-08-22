package BinaryTreePack;

public class Mirror {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val)
      { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return null;
            }

            //for left call
            TreeNode left = invertTree(root.left);

            //for right call
            TreeNode right = invertTree(root.right);

            //asigning right child's adress in left
            root.left = right;

            //asigning left  child's adress in righ t
            root.right = left;
            return root;


        }
    }
}
