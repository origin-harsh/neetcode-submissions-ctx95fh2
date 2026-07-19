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
    
    public int findSum(TreeNode root, int[] res){
        if(root == null) return 0;

        int left = Math.max(0,findSum(root.left,res));
        int right = Math.max(0,findSum(root.right,res));

        res[0] = Math.max(res[0],left+right+root.val);

        return root.val + Math.max(left,right);
        
    }
    
    public int maxPathSum(TreeNode root) {
       
        int[] res = {root.val};
        findSum(root,res);
        return res[0];
       
    }
}
