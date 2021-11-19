package BinaryTreePack;

public class SumPath3 {
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
        public int pathSum(TreeNode root, int targetSum) {
            if(root == null){
                return 0;
            }
            int root_part = countPath(root , targetSum); //  ek bar jayega root ho kr search knne for path
            int left_part = pathSum(root.left , targetSum);//  ek bar start  left child se search knne for path
            int right_part = pathSum(root.right , targetSum);//  ek bar satart right child se  search knne for path
            return root_part + left_part + right_part; //return summ of all path

        }
        public int countPath(TreeNode root , int targetSum){
            if(root == null){ // if root is null then return 0
                return 0;
            }
            int ans = 0;
            if(targetSum - root.val == 0){ // if target - root ka value then increament ans  for counting how many path exits
                ans++;
            }
             ans += countPath(root.left , targetSum - root.val); // for left searching path
             ans += countPath(root.right , targetSum - root.val);//for right
             return ans;
        }
    }
}
