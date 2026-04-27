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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Boolean> visit = new Stack<>();
        List<Integer> res = new ArrayList<>();

        stack.push(root);
        visit.push(false);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            boolean v = visit.pop();

            if (curr != null) {
                if (v) {
                    res.add(curr.val);
                }
                else {
                    stack.push(curr);
                    visit.push(true);
                    stack.push(curr.right);
                    visit.push(false);
                    stack.push(curr.left);
                    visit.push(false);

                }
            }
        }

        return res;
        
    }
}