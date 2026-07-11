class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        int total = 0 ; 
        StringBuilder sb = new StringBuilder();
        for(int i = shifts.length-1; i >=0 ;i--){
           total = (total+shifts[i])%26;
           char ch = s.charAt(i);
           char shifted= (char)(((ch-'a'+total)%26)+'a');
           sb.append(shifted);
        }
        return sb.reverse().toString();
    }
}
