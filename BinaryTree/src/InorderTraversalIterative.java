//Symmetric Tree

//Problem Link:
//https://leetcode.com/problems/symmetric-tree/description/

public class InorderTraversalIterative {
    //TC:0(n)  SC:0(n) In the worst case (skewed tree), space complexity can be O(N)
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left,root.right);
    }
    private boolean isSymmetricHelp(TreeNode left ,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val !=right.val){
            return false;
        }

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right , right.left );
    }
}
