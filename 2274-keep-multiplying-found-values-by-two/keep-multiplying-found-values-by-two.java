class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        return helper(set, original);
    }
    private int helper(HashSet<Integer> set, int val) {
        if (!set.contains(val)) return val;
        return helper(set, val * 2);
    }
}