class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        left[0] = height[0];

        for (int i = 1; i < left.length; i++) {
            int max = left[i - 1];
            left[i] = Math.max(max, height[i]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        int totalWater = 0;
        for (int k = 0; k < height.length; k++) {
            totalWater += (Math.min(left[k], right[k]) - height[k]);
        }
        return totalWater;
    }
}