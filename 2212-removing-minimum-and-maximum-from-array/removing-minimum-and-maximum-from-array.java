class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minI = -1, maxI = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minI = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxI = i;
            }
        }
        if (minI > maxI) {
            int temp = minI;
            minI = maxI;
            maxI = temp;
        }
        int left = maxI + 1;
        int right = n - minI;
        int bothSides = (minI + 1) + (n - maxI);
        return Math.min(left, Math.min(right, bothSides));
    }
}