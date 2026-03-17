class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long res = (pow(5, evenCount) * pow(4, oddCount)) % MOD;
        return (int) res;
    }
    private long pow(long base, long exp) {
        if (exp == 0) return 1;
        long half = pow(base, exp / 2);
        long result = (half * half) % MOD;
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
}