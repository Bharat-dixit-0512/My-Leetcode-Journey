class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)list.add(i);

        List<List<Integer>> ans=new ArrayList<>();
        fun(list,ans,k,new ArrayList<>(),0);
        return ans;
    }
    void fun(List<Integer> list,List<List<Integer>> ans,int k,List<Integer> c,int si){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(si>=list.size()){
            return;
        }
        //exclude
        fun(list,ans,k,c,si+1);

        //include
        c.add(list.get(si));
        fun(list,ans,k,c,si+1);
        c.remove(c.size()-1);
    }
}