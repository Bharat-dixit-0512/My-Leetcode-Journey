class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        fun(nums,result,k,new ArrayList<>(),0);
        return result;
    }
    void fun(List<Integer> nums,List<List<Integer>> result,int k,List<Integer>c,int si){
        if(c.size()==k){
            result.add(new ArrayList<>(c));
            return;
        }
        if(si>=nums.size())return;
        //exclude
        fun(nums,result,k,c,si+1);

        //include
        c.add(nums.get(si));
        fun(nums,result,k,c,si+1);
        c.remove(c.size()-1);
    }
}