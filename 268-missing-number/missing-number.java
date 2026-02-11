class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return nSum - sum;
    }
}