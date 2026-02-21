class Solution{
    public int lengthOfLongestSubstring(String s){
        int max=0;
        for(int i=0;i<s.length();i++){
            int[] fr=new int[256];
            int count=0;
            for(int j=i;j<s.length();j++){
                fr[s.charAt(j)]++;
                if(fr[s.charAt(j)]>1)break;
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}