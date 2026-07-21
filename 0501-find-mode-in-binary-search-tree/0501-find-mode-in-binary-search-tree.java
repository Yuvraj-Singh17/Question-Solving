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
    public int[] findMode(TreeNode root) {
        HashMap<Integer , Integer> map = new HashMap<>();
        helper(root , map);

        ArrayList<Integer> arr = new ArrayList<>();

        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        ArrayList<Integer> modes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }
        int[] arr1 = new int[modes.size()];
        for(int i = 0 ; i < modes.size() ; i++){
            arr1[i] = modes.get(i); 
        }
        return arr1;
    }
    public void helper(TreeNode root , HashMap<Integer , Integer> map){
        if(root == null) return ;

        helper(root.left , map);
        map.put(root.val , map.getOrDefault(root.val , 0)+1);
        helper(root.right , map);
    }
}