class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> Candidates=new ArrayList<>();
        for(int i:candidates){
            Candidates.add(i);
        }
        fun(Candidates,result,0,target,new ArrayList<>());
        return result;
    }
    void fun(List<Integer>candidates,List<List<Integer>>result,int s,int target,List<Integer>c){
        if(target==0){
            result.add(new ArrayList<>(c));
            return;
        }
        if(target<0)return;
        for(int i=s;i<candidates.size();i++){
            int num=candidates.get(i);
            c.add(num);
            fun(candidates,result,i,target-num,c);
            c.remove(c.size()-1);
        }
    }
}