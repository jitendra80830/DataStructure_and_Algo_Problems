package BinaryTreePack;

public class LCA3 {
    class Node{
        private int val;
        public Node left;
        public Node right;
        public Node parent;
    }
    class Solution{
        public Node lowestCommonAcestor(Node p , Node q){
            if(isCovered(p ,q)){
                return p;
            }
            if(isCovered(q ,p)){
                return q;
            }
            // if p and q se nhi answer then abb useke parent ko bolega
            return lowestCommonAcestor(p.parent , q.parent);

        }
        public boolean isCovered(Node p , Node q){
            if(p==null){ // if p is null the return false acestor nhi hai
                return false;
            }
            if(p==q){ // if p and q ka adress same hai to accestot hai return true
                return true;
            }
            return isCovered(p.left , q) || isCovered(p.right , q); // search kr ki lao ki p ke left me q hai ya right me hai q ya nhi
        }
    }
}
