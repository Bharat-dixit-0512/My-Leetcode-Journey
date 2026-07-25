class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        int max1 = -1, max2 = -1;
        for (int digit : arr) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }
        return max1 * max2;
    }
}
