//Binary Tree Postorder Traversal using Recursion

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

//Problem Link:
//https://leetcode.com/problems/binary-tree-postorder-traversal/description/

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    //TC:0(n)  SC:0(n) -> Recursion stack space
    private void dfs(TreeNode root, List<Integer> postorder){
        if(root==null){
            return;
        }
        dfs(root.left,postorder);
        dfs(root.right,postorder);
        postorder.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder= new ArrayList<>();
        dfs(root,postorder);
        return postorder;
    }
}
