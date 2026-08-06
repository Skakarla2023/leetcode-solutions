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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftd = diameterOfBinaryTree(root.left);
        int rightd = diameterOfBinaryTree(root.right);

        return Math.max(calHeight(root.left) + calHeight(root.right), Math.max(leftd, rightd));
    }

    static int calHeight(TreeNode p) {
        if (p == null) {
            return 0;
        }

        return 1 + Math.max(calHeight(p.left), calHeight(p.right));
    }
}
