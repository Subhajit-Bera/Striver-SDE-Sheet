//Diameter of Binary Tree
//https://leetcode.com/problems/diameter-of-binary-tree/description/https://leetcode.com/problems/diameter-of-binary-tree/description/

public class DiameterOfBinaryTree {
    //TC:0(n)   SC:0(H) Recursion Stack space (Where “H”  is the height of binary tree )
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter=new int[1];
        height(root,diameter);
        return diameter[0];
    }
    private int height(TreeNode root,int[] diameter){
        if(root==null){
            return 0;
        }

        int lh=height(root.left,diameter);
        int rh=height(root.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);

        return 1+Math.max(lh,rh);

    }
}
