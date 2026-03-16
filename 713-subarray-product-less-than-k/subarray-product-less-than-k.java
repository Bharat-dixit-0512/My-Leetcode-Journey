class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; 
        int product = 1;
        int start = 0;
        int end = 0;
        int count = 0;
        while (end < nums.length) {
            product *= nums[end];
            while (product >= k && start <= end) {
                product /= nums[start];
                start++;
            }
            count += (end - start + 1);
            end++;
        }
        return count;
    }
}