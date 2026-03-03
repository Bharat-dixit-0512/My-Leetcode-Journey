class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int csum = nums[0];
        for (int i = 1; i < n; i++) {
            csum = Math.max(nums[i], csum + nums[i]);
            max = Math.max(csum, max);
        }
        int min = nums[0];
        int cmin = nums[0];
        int total = nums[0];
        for (int i = 1; i < n; i++) {
            total += nums[i];
            cmin = Math.min(nums[i], cmin + nums[i]);
            min = Math.min(cmin, min);
        }
        if (max < 0) return max;
        return Math.max(max, total - min);
    }
}