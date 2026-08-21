class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int size=q.size();
            while(size-->0){
                TreeNode f=q.poll();
                l.add(f.val);

                if(f.left!=null)q.add(f.left);
                if(f.right!=null)q.add(f.right);
            }
            ans.add(l);
        }
        Collections.reverse(ans);
        return ans;
    }
}