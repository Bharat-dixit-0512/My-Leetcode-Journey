class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        pOrder(root,ans);
        return ans;        
    }
    void pOrder(TreeNode root,List<Integer> ans){
        if(root==null)return;
        pOrder(root.left,ans);
        pOrder(root.right,ans);
        ans.add(root.val);
    }
}