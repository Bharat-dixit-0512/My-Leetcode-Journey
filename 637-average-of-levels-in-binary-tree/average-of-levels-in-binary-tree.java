class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)return list;
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            Double sum=0.00;
            for(int i=0;i<n;i++){
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);

            }
            Double avg=sum/n;
            list.add(avg);
        }
        return list;
    }
}