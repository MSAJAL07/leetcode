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
    public int res = 0;

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int h1 =  maxDepth(root.left);
        int h2 = maxDepth(root.right);
        int _res =  h1 + h2;
        if (_res > res)
            res = _res;
        return 1 + Math.max(h1, h2);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }
}