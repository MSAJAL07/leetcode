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
    public int f(TreeNode root) {
        if (root == null)
            return 0;
        int h1 = f(root.left);
        int h2 = f(root.right);
        if(h1 == -1 || h2 == -1){
            return -1;
        }
        if( Math.abs(h1-h2) <= 1){
            return  1 + Math.max(h1, h2);
        }
        return -1;
    }

    public boolean isBalanced(TreeNode root) {
        int height = f(root);
        System.out.println(height);
        if(height != -1){
            return true;
        }else{
            return false;
        }

    }
}