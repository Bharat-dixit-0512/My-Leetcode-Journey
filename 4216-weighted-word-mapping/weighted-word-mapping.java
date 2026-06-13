class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(char ch:s.toCharArray()){
                int idx=abcdIdx(ch);
                sum+=weights[idx];
            }
            int mod=sum%26;
            char mapped = (char) ('z' - mod);
            sb.append(mapped);
        }
        return sb.toString();
    }
    int abcdIdx(char ch) {
        return ch - 'a';
    }
}