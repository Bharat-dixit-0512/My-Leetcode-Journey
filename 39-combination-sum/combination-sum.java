class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }  
    void fun(int[] cand,int target, List<List<Integer>> ans,List<Integer> l,int i){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(target<0)return;
       for(int j=i;j<cand.length;j++){
        int num=cand[j];
        l.add(num);
        fun(cand,target-num,ans,l,j);
        l.remove(l.size()-1);
       }
    }
}