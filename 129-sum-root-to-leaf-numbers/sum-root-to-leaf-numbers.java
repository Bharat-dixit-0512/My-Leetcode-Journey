class Solution {
    public int sumNumbers(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        fun(list,sb,root);
        int sum=0;
        for(String s:list){
            if(!s.isEmpty())sum+=Integer.parseInt(s);
        }
        return sum;

    }
    void fun(List<String> list,StringBuilder sb,TreeNode root){
        if(root==null)return;
        sb.append(root.val);
        if(root.left==null && root.right==null){
            list.add(sb.toString());

        }else{
            fun(list,new StringBuilder(sb),root.left);
            fun(list,new StringBuilder(sb),root.right);
        }
    }
}