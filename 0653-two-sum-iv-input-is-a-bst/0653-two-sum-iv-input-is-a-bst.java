/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left, right;
 *     TreeNode(int val) { this.val = val; }
 * }
 */

import java.util.*;

class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    boolean reverse;

    public BSTIterator(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        pushAll(root);
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            if (reverse) node = node.right;
            else node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        
        if (!reverse) {
            pushAll(node.right);
        } else {
            pushAll(node.left);
        }

        return node.val;
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        BSTIterator left = new BSTIterator(root, false); 
        BSTIterator right = new BSTIterator(root, true); 

        int i = left.next();
        int j = right.next();

        while (i < j) {
            int sum = i + j;

            if (sum == k) return true;
            else if (sum < k) {
                i = left.next();
            } else {
                j = right.next();
            }
        }

        return false;
    }
}