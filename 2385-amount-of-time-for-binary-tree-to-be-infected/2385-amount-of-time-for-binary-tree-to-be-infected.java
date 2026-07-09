class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode target = buildParent(root, parent, start);
        
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        q.offer(target);
        visited.add(target);
        
        int time = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            boolean burned = false;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                
                if (node.left != null && !visited.contains(node.left)) {
                    burned = true;
                    visited.add(node.left);
                    q.offer(node.left);
                }
                
                if (node.right != null && !visited.contains(node.right)) {
                    burned = true;
                    visited.add(node.right);
                    q.offer(node.right);
                }
                
                if (parent.get(node) != null && !visited.contains(parent.get(node))) {
                    burned = true;
                    visited.add(parent.get(node));
                    q.offer(parent.get(node));
                }
            }
            
            if (burned) time++;
        }
        
        return time;
    }
    
    private TreeNode buildParent(TreeNode root, Map<TreeNode, TreeNode> parent, int start) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode target = null;
        
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            
            if (node.val == start) target = node;
            
            if (node.left != null) {
                parent.put(node.left, node);
                q.offer(node.left);
            }
            
            if (node.right != null) {
                parent.put(node.right, node);
                q.offer(node.right);
            }
        }
        
        return target;
    }
}