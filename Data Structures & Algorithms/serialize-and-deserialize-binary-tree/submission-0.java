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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "null,";
        return root.val  + "," + serialize(root.left) + serialize(root.right);
    }
    public TreeNode des(Queue<String> q){
        String vall = q.poll();
        if(vall.equals("null")) return null;
        TreeNode res = new  TreeNode(Integer.parseInt(vall));
        res.left = des(q);
        res.right = des(q);
        return res;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");

        Queue<String> q = new LinkedList<>(Arrays.asList(values));

        return des(q);
    }
}
