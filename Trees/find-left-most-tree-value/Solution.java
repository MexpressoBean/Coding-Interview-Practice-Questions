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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> treeQueue = new LinkedList();
        
        treeQueue.offer(root); // Inserts the root into the queue
        
        while(!treeQueue.isEmpty()) // while treeQueue is not empty
        {
            root = treeQueue.poll(); // Removes top element from the queue
            
            if(root.right != null) // Right traversal
            {
                treeQueue.offer(root.right); // Inserts right node into the queue
            }
            
            if(root.left != null) // Left traversal
            {
                treeQueue.offer(root.left); // Inserts left node into the queue
            }
        }
        
        return root.val; // Left most node in the last row
    }
}