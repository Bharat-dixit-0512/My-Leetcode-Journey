class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(candidates,target,ans,0,new ArrayList<>());
        return ans;
    }
    void fun(int[]candidates,int target,List<List<Integer>> ans,int si,List<Integer> c){
        if(target==0){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(target<0)return;
        for(int i=si;i<candidates.length;i++){
            int num=candidates[i];
            c.add(num);
            fun(candidates,target-num,ans,i,c);
            c.remove(c.size()-1);
        }
    }
}