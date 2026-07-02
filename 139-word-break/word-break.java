class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return solve(s, 0, wordDict, dp);
    }

    private boolean solve(String s, int idx, List<String> wordDict, Boolean[] dp) {
        // Base case
        if (idx == s.length()) {
            return true;
        }

        // Already computed
        if (dp[idx] != null) {
            return dp[idx];
        }

        // Try every word
        for (String word : wordDict) {
            int len = word.length();

            // Check if word matches starting at idx
            if (idx + len <= s.length() &&
                s.substring(idx, idx + len).equals(word)) {

                if (solve(s, idx + len, wordDict, dp)) {
                    return dp[idx] = true;
                }
            }
        }
        return dp[idx] = false;
    }
}