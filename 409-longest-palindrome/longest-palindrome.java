class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> count=new HashMap<>();

        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        int length=0;
        boolean hasOdd=false;

        for(int cnt:count.values()){
            if(cnt%2==0){
                length+=cnt;
            }else{
                length+=cnt-1;
                hasOdd=true;
            }
        }

        if(hasOdd){
            length+=1;
        }
        return length;
    }
}