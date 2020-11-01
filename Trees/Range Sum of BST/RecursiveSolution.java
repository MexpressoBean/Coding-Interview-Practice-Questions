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

class RecursiveSolution 
{
    int rangeSum;
    
    public int rangeSumBST(TreeNode root, int L, int R) 
    {
        rangeSum = 0;
        getSum(root, L, R); // Start recursive loop
        
        return rangeSum;
    }
    
    // Recursive function
    public void getSum(TreeNode root, int L, int R)
    {
        if(root != null)
        {
            if(root.val >= L && root.val <= R) // Boundry check here
            {
                rangeSum += root.val;
            }
            
            if(root.val > L) 
            {
                getSum(root.left, L, R); // Recursive call - Keep searching left nodes 
            }


            if(root.val < R)
            {
                getSum(root.right, L, R); // Recursive call - Keep searching on the right nodes
            }   
        }
    }
}