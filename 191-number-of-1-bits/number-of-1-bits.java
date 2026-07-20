class Solution {
    public int hammingWeight(int n) {
        int SBC = 0;
        while (n != 0) {
            n &= (n - 1);
            ++SBC;
        }
        return SBC;
    }
}