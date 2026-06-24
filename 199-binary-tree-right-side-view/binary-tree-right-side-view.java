class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return new ArrayList<>();
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
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            List<Integer>l=ans.get(i);
            res.add(l.get(l.size()-1));
        }
        return res;
    }
}