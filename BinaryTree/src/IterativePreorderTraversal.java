

//Problem Link: https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import java.util.*;

public class IterativePreorderTraversal {
    //TC:0(n) SC:0(H) In the worst case H is the height of the binary tree
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        if(root==null){
            return preorder;
        }
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            preorder.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }

        }
        return preorder;

    }

}
