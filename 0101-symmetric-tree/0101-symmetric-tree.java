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
    boolean check(TreeNode l, TreeNode r) {

        // Both are NULL
        if (l == null && r == null)
            return true;

        // One is NULL or both are NULL
        if (l == null || r == null)
            return false;

        // Check values and mirrored subtrees
        if (l.val == r.val &&
            check(l.left, r.right) &&
            check(l.right, r.left))
            return true;

        return false;
    }
    public boolean isSymmetric(TreeNode root) {
         // Empty tree
        if (root == null){
            return true;
        }else{
        return check(root.left, root.right);
        }
    }
}