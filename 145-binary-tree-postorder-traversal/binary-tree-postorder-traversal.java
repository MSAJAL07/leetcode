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
    // public void it(List<Integer> res, TreeNode root) {
    //     if (root == null)
    //         return;
    //     it(res, root.left);
    //     it(res, root.right);
    //     res.add(root.val);
    // }
    public List<Integer> po( TreeNode root){
       
        List<Integer> res = new ArrayList<Integer>();
         if(root == null) return res;
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.push(root);
        TreeNode _root ;
        while(!stack1.isEmpty()){
            _root = stack1.pop();
            stack2.push(_root);
            if(_root.left != null) stack1.push(_root.left);
            if(_root.right != null) stack1.push(_root.right);
        }
        while(!stack2.isEmpty()){
            res.add(stack2.pop().val);
        }
        return res;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        Solution solution = new Solution();
        List<Integer> res = solution.po( root);
        return res;

    }
}