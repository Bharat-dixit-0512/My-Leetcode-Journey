class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        fun(nums, list, new ArrayList<>(), 0);
        return list;
    }
    void fun(int[] nums, List<List<Integer>> list, List<Integer> l, int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }
        fun(nums, list, l, i + 1);
        l.add(nums[i]);
        fun(nums, list, l, i + 1);
        l.remove(l.size() - 1);
    }
}