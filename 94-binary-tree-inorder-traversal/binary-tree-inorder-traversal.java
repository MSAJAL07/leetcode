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
    public void it(List<Integer> res, TreeNode root){
        if(root == null) return;
        it(res, root.left);
            res.add(root.val);

        it(res,root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        Solution solution = new Solution();
        List<Integer> res = new ArrayList<Integer>();
        solution.it(res, root);
        return res;
    }
}