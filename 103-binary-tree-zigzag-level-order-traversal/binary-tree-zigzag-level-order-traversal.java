class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return res;
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

            res.add(l);
        }
        for(int i=1;i<res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
}