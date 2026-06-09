class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numbers=new ArrayList<>();
        for(int i:nums){
            numbers.add(i);
        }
        List<List<Integer>> result=new ArrayList<>();

        fun(numbers,result,new ArrayList<>());
        return result;
    }
    void fun(List<Integer> nums,List<List<Integer>> ans,List<Integer>p){
        if(nums.size()==0){
            ans.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<nums.size();i++){
            int num=nums.get(i);
            p.add(num);
            nums.remove(i);
            fun(nums,ans,p);
            p.remove(p.size()-1);
            nums.add(i,num);
        }
    }
}