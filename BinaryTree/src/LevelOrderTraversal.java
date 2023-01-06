
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

//Problem Link:https://leetcode.com/problems/binary-tree-level-order-traversal/description/


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {
    //TC:0(n) SC:0(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ansList=new LinkedList<List<Integer>>();
        if(root==null){
            return ansList;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            ansList.add(subList);
        }
        return ansList;

    }
}
