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
        TreeNode _root1;
        while (!stack.isEmpty()) {
            _root1 = stack.pop();
            res.add(_root1.val);
            if (_root1.right != null) {
                _root1 = _root1.right;
                while (_root1 != null) {
                    stack.push(_root1);
                    _root1 = _root1.left;
                }
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