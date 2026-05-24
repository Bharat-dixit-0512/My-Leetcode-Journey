public class Solution {
    private Set<Integer> stoneSet;
    private Map<String, Boolean> memo;
    private int lastStone;

    public boolean canCross(int[] stones) {
        stoneSet = new HashSet<>();
        for (int s : stones) stoneSet.add(s);
        lastStone = stones[stones.length - 1];
        memo = new HashMap<>();
        return dfs(0, 0);
    }

    private boolean dfs(int pos, int jump) {
        if (pos == lastStone) return true;
        String key = pos + "," + jump;
        if (memo.containsKey(key)) return memo.get(key);

        for (int step = jump - 1; step <= jump + 1; step++) {
            if (step > 0 && stoneSet.contains(pos + step)) {
                if (dfs(pos + step, step)) {
                    memo.put(key, true);
                    return true;
                }
            }
        }

        memo.put(key, false);
        return false;
    }
}