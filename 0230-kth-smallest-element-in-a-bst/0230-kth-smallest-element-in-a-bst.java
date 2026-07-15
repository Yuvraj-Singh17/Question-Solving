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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root , arr , k);
        int ans = 0;
        // for(int i = 0 ; i < k ; i++){
        //     if(i + 1 == k){
        //         ans = arr.get(i);
        //     }
        // }
        return arr.get(k-1);

    }
    public void helper(TreeNode root , ArrayList<Integer> arr , int k){
        if(root == null) return;
        if(k == 0) return;
        helper(root.left , arr , k);
        arr.add(root.val);
        helper(root.right , arr , k);
        k--;
    }
}