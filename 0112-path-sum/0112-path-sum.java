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
    public boolean pathsum(TreeNode node,int current_sum , int target_sum){
        if (node==null) return false;
        current_sum+=node.val;
        if (node.left==null && node.right==null) return current_sum==target_sum;
        return pathsum(node.left,current_sum,target_sum)||pathsum(node.right,current_sum,target_sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathsum(root,0,targetSum);
        
    }
}