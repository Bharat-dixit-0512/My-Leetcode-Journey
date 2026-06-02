class Solution {
    public int repeatedNTimes(int[] nums) {
        int arr[] = new int[10001];
        int n = nums.length / 2;
        for (int i : nums) {
            arr[i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
