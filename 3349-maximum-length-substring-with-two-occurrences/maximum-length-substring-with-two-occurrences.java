class Solution {
    public int maximumLengthSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(count(sub)){
                    ans=Math.max(ans,sub.length());
                }

            }
        }
        return ans;
    }
    boolean count(String s){
        Map<Character, Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
            if (m.get(ch) > 2) return false; 
        }
        return true;
    }
}