package BinaryTreePack;

import com.sun.source.tree.Tree;

public class Preorder_Inorder_CreateTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return create_Tree(preorder , inorder , 0 , preorder.length-1 , 0 , inorder.length-1);

        }
        public TreeNode create_Tree(int pre[] , int in[] , int plo , int phi , int ilo , int ihi) {
            if(plo > phi || ilo > ihi){
                return null;
            }
            TreeNode node = new TreeNode();
            node.val = pre[plo]; // Preorder ka 1st index fot root
            int i = search(in, pre[plo], ilo, ihi); // for searching root in inorder i means root node's index
            int nel = i - ilo; //no of element in inorder of left side

            // for left nodes for bodh preorder range(plo+1 , plo+nel) and inorder range(ilo , i-1)
            node.left = create_Tree(pre , in , plo+1 , plo+nel , ilo , i-1);

            // for right nodes for bodh preorder range(plo+ nel+1 , phi) and inorder range(i+1 , ihi)
            node.right = create_Tree(pre , in , plo+ nel+1 , phi , i+1 , ihi);
            return node;
        }
        private int search(int[] in, int item, int ilo, int ihi) { // searching root of preorder in inorder
            for(int i =ilo;i<=ihi;i++){
                if(in[i] == item){
                    return i;
                }

            }
            return -1;

        }
    }
}
