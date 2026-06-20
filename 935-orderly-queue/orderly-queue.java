class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char temp[]=s.toCharArray();
            Arrays.sort(temp);
            return new String(temp);
        }else{
            String ans=s;
            for(int i=0;i<s.length();i++){
                s=s.substring(1)+s.substring(0,1);
                if(ans.compareTo(s)>0){
                    ans=s;
                }
            }
        return ans;
        }
    }
}