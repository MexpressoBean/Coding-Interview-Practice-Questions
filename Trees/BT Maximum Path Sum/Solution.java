/*
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
    int maximumPathSum;

    public int maxPathSum(TreeNode root) {
        maximumPathSum = Integer.MIN_VALUE;
        
        getCurrentPathSum(root); 
        
        return maximumPathSum;   
    }
    
    
    public int getCurrentPathSum(TreeNode node) {
        if(node == null) { return 0; } // If given a null node, there is no path sum
        
        // Recursively traverse the left and right sub trees
        int left  = Math.max(0, getCurrentPathSum(node.left));  // Recursively go through the left nodes on the tree
        int right = Math.max(0, getCurrentPathSum(node.right)); // Recursively go through the right nodes on the tree
            
        maximumPathSum = Math.max( maximumPathSum, (left + right+ node.val) ); // Check for the largest path value
        
        return (Math.max(left, right) + node.val);
    }
}