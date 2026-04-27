class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        fun(n,0,0,"",list);
        return list;
    }
    private void fun(int n, int open,int close,String str,ArrayList<String> list){
        if(str.length()==2*n){
            list.add(str);
            return;
        }
        if(open<n)fun(n,open+1,close,str+"(",list);
        if(close<open)fun(n,open,close+1,str+")",list);

    }
}