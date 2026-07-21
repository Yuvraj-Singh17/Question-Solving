/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] P) {
        return bst(P , Integer.MAX_VALUE , new int[]{0});
    }
    public TreeNode bst(int[] P , int bound , int[] i){
        if(i[0] == P.length || P[i[0]] > bound){
            return null;
        }
        TreeNode root = new TreeNode(P[i[0]++]);
        root.left = bst(P , root.val , i);
        root.right = bst(P , bound , i);
        return root;
    }
}