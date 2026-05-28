class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows >= n)
            return s;
        int cycle = 2 * numRows - 2;
        char[] out = new char[n];
        int idx = 0;
        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < n; i += cycle) {
                out[idx++] = s.charAt(i);
                int diag = i + cycle - 2 * r;
                if (r != 0 && r != numRows - 1 && diag < n) {
                    out[idx++] = s.charAt(diag);
                }
            }
        }
        return new String(out);
    }
}