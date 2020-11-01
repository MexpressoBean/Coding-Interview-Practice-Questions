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

class IterativeSolution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int rangeSum = 0; 
        
        Stack<TreeNode> stack = new Stack();
        stack.push(root); // Add the root node to the stack
        
        while(!stack.isEmpty()) // While the stack is not empty
        {
            TreeNode node = stack.pop();
            
            if(node != null)
            {
                if(node.val >= L && node.val <= R) // If the value is in range
                {
                    rangeSum += node.val; // Add the value to the sum
                }
                
                if(node.val > L) // If value of current node is greater than
                                 // the left boundry, there are still left
                                 // child nodes to be checked.
                {
                    stack.push(node.left); // Keep searching left nodes
                }
                
                
                if(node.val < R)
                {
                    stack.push(node.right); // Keep searching on the right nodes
                }                  
            }
        }
        return rangeSum; // This is the sum of values between the specified range
    }
}