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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        int depth = 1;
        while(!q1.isEmpty()){
            int size = q1.size();
            for(int i=0;i<size;i++){
                TreeNode node = q1.poll();
                if(node.left == null && node.right == null){
                    return depth;
                }

                if(node.left != null) q1.offer(node.left);
                if(node.right != null) q1.offer(node.right);

            }
            depth++;
        }
        return depth;
    }
}