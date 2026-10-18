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
    int count = 0;
    public int goodNodes(TreeNode root) {
        recurse(root, Integer.MIN_VALUE);
        return count;
    }
    public void recurse(TreeNode root, int maxsum){
        if(root == null) return;
        if(root.val >= maxsum){
            count++;
        }
        maxsum = Math.max(maxsum, root.val);
        recurse(root.left, maxsum);
        recurse(root.right, maxsum);
    }
}