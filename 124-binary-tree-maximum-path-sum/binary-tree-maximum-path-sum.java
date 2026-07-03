class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        fun(root);
        return max;
    }
    int fun(TreeNode root){
        if(root==null)return 0;

        int left=Math.max(0,fun(root.left));
        int right=Math.max(0,fun(root.right));

        max=Math.max(max,root.val+left+right);
        
        return root.val+Math.max(left,right);
    }
}