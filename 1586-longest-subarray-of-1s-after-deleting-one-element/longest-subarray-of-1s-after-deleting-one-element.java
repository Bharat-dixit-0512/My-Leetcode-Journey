class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zero = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) zero++;
                if (zero > 1) break;
            
                max = Math.max(max, j - i);
            }
        }
        return max;
    }
}