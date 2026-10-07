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
    public int maxPathSum(TreeNode root) {
        int[] diameter = {Integer.MIN_VALUE};;
        findHeight(root, diameter);
        return diameter[0];
    }
    public int findHeight(TreeNode root, int[] diameter){
        if(root == null) return 0;
        int lh = Math.max(0, findHeight(root.left, diameter));
        int rh = Math.max(0, findHeight(root.right, diameter));
        diameter[0] = Math.max(diameter[0], lh+rh+root.val);
        return root.val+Math.max(lh, rh);
    }
}