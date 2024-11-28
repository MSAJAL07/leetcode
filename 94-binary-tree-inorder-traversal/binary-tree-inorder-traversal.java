/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
    public void it(List<Integer> res, TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode _root = root;
        while (_root != null) {
            stack.push(_root);
            _root = _root.left;
        }
        while (!stack.isEmpty()) {
            _root = stack.pop();
            res.add(_root.val);
            _root = _root.right;
            while (_root != null) {
                stack.push(_root);
                _root = _root.left;
            }

        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Solution solution = new Solution();
        List<Integer> res = new ArrayList<Integer>();
        solution.it(res, root);
        return res;
    }
}