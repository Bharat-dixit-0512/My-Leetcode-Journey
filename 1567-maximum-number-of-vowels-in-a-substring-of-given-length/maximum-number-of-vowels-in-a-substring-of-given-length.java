class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i)))count++;
            if(i>=k && isVowel(s.charAt(i-k)))count--;
            max=Math.max(max,count);
        }
        return max;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}