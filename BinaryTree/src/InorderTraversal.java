
//Binary Tree Inorder Traversal using Recursion


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


import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    //TC:0(n)  SC:0(n) -> Recursion stack space
    private void dfs(TreeNode root, List<Integer> inorder){
        if(root==null){
            return ;
        }
        dfs(root.left,inorder);
        inorder.add(root.val);
        dfs(root.right,inorder);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        dfs(root,inorder);
        return inorder;
    }
}
