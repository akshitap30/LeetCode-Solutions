/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        buildParentMap(root, null, parent);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int distance = 0;

        while (!queue.isEmpty()) {

            if (distance == k) {
                break;
            }

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if (current.left != null &&
                    visited.add(current.left)) {
                    queue.offer(current.left);
                }
                if (current.right != null &&
                    visited.add(current.right)) {
                    queue.offer(current.right);
                }

                TreeNode par = parent.get(current);

                if (par != null && visited.add(par)) {
                    queue.offer(par);
                }
            }

            distance++;
        }
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }

        return result;
    }
    public void buildParentMap(
            TreeNode node,
            TreeNode par,
            Map<TreeNode, TreeNode> parent) {

        if (node == null) return;

        if (par != null) {
            parent.put(node, par);
        }

        buildParentMap(node.left, node, parent);
        buildParentMap(node.right, node, parent);
    }
}