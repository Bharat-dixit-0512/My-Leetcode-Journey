class Solution {
    public String smallestPalindrome(String s) {
        int fre[]=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        char ans[]=new char[s.length()];
        int left=0,right=s.length()-1;
        for(int i=0;i<fre.length;i++){
            while(fre[i]>=2){
                ans[left++]=(char)('a'+i);
                ans[right--]=(char)('a'+i);
                fre[i]-=2;
            }
            if(fre[i]==1){
                ans[ans.length/2]=(char)('a'+i);
            }
        }
        return new String(ans);
    }
}