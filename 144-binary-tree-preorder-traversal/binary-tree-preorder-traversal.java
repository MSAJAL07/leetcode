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
    // public void it(List<Integer> res, TreeNode root){
    // if(root == null) return;
    // res.add(root.val);
    // it(res, root.left);
    // it(res,root.right);

    // }

    // }
    public void pr(List<Integer> res, TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode _root = root;
        while (_root != null) {
            stack.push(_root);
            res.add(_root.val);
            _root = _root.left;
        }
        while (!stack.isEmpty()) {
            _root = stack.pop();
            _root = _root.right;
            while (_root != null) {
                stack.push(_root);
                res.add(_root.val);
                _root = _root.left;
            }
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        Solution solution = new Solution();
        List<Integer> res = new ArrayList<Integer>();
        solution.pr(res, root);
        return res;
    }
}