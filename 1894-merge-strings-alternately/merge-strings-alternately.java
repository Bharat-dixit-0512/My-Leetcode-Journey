class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stb=new StringBuilder();
        int char1=0,char2=0;
        while(char1<word1.length() && char2<word2.length()){
            stb.append(word1.charAt(char1)).append(word2.charAt(char2));
            char1++;
            char2++;
        }
        while(char1<word1.length()){
            stb.append(word1.charAt(char1));
            char1++;
        }
        while(char2<word2.length()){
            stb.append(word2.charAt(char2));
            char2++;
        }
        return stb.toString();
    }
}