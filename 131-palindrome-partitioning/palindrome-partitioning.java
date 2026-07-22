class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        backtrack(s,ans,new ArrayList<>(),0);
        return ans;
    }
    public void backtrack(String s,List<List<String>> ans,List<String> list,int start){
        if(start==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                list.add(s.substring(start,end+1));
                backtrack(s,ans,list,end+1);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int st,int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e))return false;
            st++;
            e--;
        }
        return true;
    }
}