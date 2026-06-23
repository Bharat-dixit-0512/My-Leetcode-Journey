class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            while(size-->0){
                TreeNode f=q.poll();
                list.add(f.val);
                if(f.left!=null)q.add(f.left);
                if(f.right!=null)q.add(f.right);
            }
            ans.add(list);
        }
        for(int i=1;i<ans.size();i+=2){
            Collections.reverse(ans.get(i));
        }
        return ans;
    }
}