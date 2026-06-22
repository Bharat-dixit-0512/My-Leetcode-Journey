class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> output=new ArrayList<>();
        dfs(root,targetSum,0,output,new ArrayList<>());
        return output;
    }
    void dfs(TreeNode root,int targetSum,int curSum,List<List<Integer>> output,List<Integer> currPath){
        if(root==null)return;

        curSum+=root.val;
        currPath.add(root.val);

        if(root.left==null && root.right==null && curSum==targetSum){
            output.add(new ArrayList<>(currPath));

        }
        dfs(root.left,targetSum,curSum,output,currPath);
        dfs(root.right,targetSum,curSum,output,currPath);
        //BackTrack;
        currPath.remove(currPath.size()-1);
    }
}