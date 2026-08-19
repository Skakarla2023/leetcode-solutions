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

import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) {
            return res;
        }

        if(root.left==null && root.right==null) {
            return Arrays.asList(Arrays.asList(root.val));
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();

            for(int i=0;i<size;i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);

                if(curr.left != null) {
                    q.offer(curr.left);
                }

                if(curr.right != null) {
                    q.offer(curr.right);
                }   
            }
            res.add(list);
        }

        
        Collections.reverse(res);
        return res;
    }
}
