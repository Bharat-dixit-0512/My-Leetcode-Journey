class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        permutations(nums, used, new ArrayList<>());
        return res;
    }
    public void permutations(int[] nums, boolean[] used, List<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            list.add(nums[i]);
            used[i] = true;
            permutations(nums, used, list);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}