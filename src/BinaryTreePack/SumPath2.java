package BinaryTreePack;

import java.util.ArrayList;
import java.util.List;

public class SumPath2 {
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> curr = new ArrayList<>();
            hasPathSum(root , targetSum , list ,curr);
            return list;

        }
        public void hasPathSum(TreeNode root, int targetSum ,List<List<Integer>> list , List<Integer> curr){

            if(root == null){ // if null hi null hai to return false
                return ;
            }
            //if root ka left and right node null hai and jo target value hai
            // usme se root ka value minus krke if 0 aata hai to means tatget mil gaya hai return true ok
            if(root.left == null && root.right == null && targetSum - root.val == 0){
                curr.add(root.val);
                list.add(new ArrayList<Integer>(curr));
                curr.remove(curr.size() -1);

            }
            curr.add(root.val);
            hasPathSum(root.left , targetSum - root.val ,list ,curr);
            hasPathSum(root.right , targetSum - root.val ,list ,curr);
            curr.remove(curr.size() -1);



        }
    }
}
