class Solution {
    private Map<Long, Integer> memo = new HashMap<>();
    public int integerReplacement(int n) {
        return helper((long) n); // cast to long to avoid overflow at n+1
    }
    private int helper(long n) {
        if (n == 1) return 0;
        if (memo.containsKey(n)) return memo.get(n);
        int steps;
        if ((n & 1) == 0) {
            steps = 1 + helper(n >> 1);
        } else {
            steps = 1 + Math.min(helper(n - 1), helper(n + 1));
        }
        memo.put(n, steps);
        return steps;
    }
}