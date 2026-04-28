class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }
    private void backtrack(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> list) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, temp, list);
            temp.remove(temp.size() - 1);
        }
    }
}
