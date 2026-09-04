class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            leftMax[i] = max;
        }

        int min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            rightMin[i] = min;
        }

        for (int i = 0; i < n; i++) {
            int instability = leftMax[i] - rightMin[i];
            if (instability <= k) {
                return i;
            }
        }
        return -1;
    }
}