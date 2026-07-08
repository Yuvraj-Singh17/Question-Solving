/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void makeParents(TreeNode root , Map<TreeNode , TreeNode> parent_track , TreeNode target){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.left != null){
                parent_track.put(current.left , current);
                q.offer(current.left);
            }
            if(current.right != null){
                parent_track.put(current.right , current);
                q.offer(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode , TreeNode> parent_track = new HashMap<>();
        makeParents(root , parent_track , root);
        Map<TreeNode , Boolean> vis = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(target);
        vis.put(target,true);
        int curr_level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i = 0 ; i < size ; i++){
                TreeNode current = q.poll();
                if(current.left != null && vis.get(current.left) == null){
                    q.offer(current.left);
                    vis.put(current.left , true);
                }
                if(current.right != null && vis.get(current.right) == null){
                    q.offer(current.right);
                    vis.put(current.right , true);
                }
                if(parent_track.get(current) != null && vis.get(parent_track.get(current))== null){
                    q.offer(parent_track.get(current));
                    vis.put(parent_track.get(current) , true);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            res.add(current.val);
        }
        return res;
    }
}