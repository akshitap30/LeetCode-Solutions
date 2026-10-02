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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        q1.offer(root);
        while(!q1.isEmpty()){
            int levelNum = q1.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<levelNum;i++){
            if(q1.peek().left != null) q1.offer(q1.peek().left);
            if(q1.peek().right != null) q1.offer(q1.peek().right);
            sublist.add(q1.poll().val);
            }
            list.add(sublist);
        }
        return list;
    }
}