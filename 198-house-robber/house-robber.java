class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums, n - 1, dp);
    }
    private int helper(int[] nums, int i, int[] dp) {
        if (i < 0) return 0;
        if (dp[i] != -1) return dp[i];
        int pick = nums[i] + helper(nums, i - 2, dp);
        int skip = helper(nums, i - 1, dp);
        dp[i] = Math.max(pick, skip);
        return dp[i];
    }
}
