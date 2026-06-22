class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for (char c : s.toCharArray()) {
            freqS[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            freqT[c - 'a']++;
        }
        int result = Integer.MAX_VALUE;
        for (char c : target.toCharArray()) {
            result = Math.min(result, freqS[c - 'a'] / freqT[c - 'a']);
        }
        return result;
    }
}
