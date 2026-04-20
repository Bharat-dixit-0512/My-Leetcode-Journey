class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans1 = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (colors[0] != colors[j]) {
                ans1 = j;
                break;
            }
        }
        int ans2 = 0;
        for (int i = 0; i < n; i++) {
            if (colors[n - 1] != colors[i]) {
                ans2 = (n - 1) - i;
                break;
            }
        }
        return Math.max(ans1, ans2);
    }
}
