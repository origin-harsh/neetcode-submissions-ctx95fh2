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
    public int search(int[] inorder,int val,int st,int end){
        for(int i = st;i<=end;i++){
            if(inorder[i] == val) return i;
        }
        return -1;
    }
    public TreeNode buildt(int[] preorder,int[] inorder,int[] preIndex,int st,int end){
       if(st>end) return null; 
       int rootVal = preorder[preIndex[0]];
       preIndex[0]++;
       TreeNode root = new TreeNode(rootVal);
       int index = search(inorder,rootVal,st,end);
       root.left = buildt(preorder,inorder,preIndex,st,index -1);
       root.right = buildt(preorder,inorder,preIndex,index +1,end);
       return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] preIndex = {0};
        return buildt(preorder,inorder,preIndex,0,preorder.length-1);

    }
}
