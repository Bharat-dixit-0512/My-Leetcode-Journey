class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        List<List<Integer>> result=new ArrayList<>();
        fun(list,result,new ArrayList<>(),k,0);
        return result;
    }
    void fun(List<Integer> nums,List<List<Integer>>ans,List<Integer> c,int k,int si){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(si>=nums.size())return;
        //exclude
        fun(nums,ans,c,k,si+1);

        //include
        c.add(nums.get(si));
        fun(nums,ans,c,k,si+1);
        c.remove(c.size()-1);
    }
}