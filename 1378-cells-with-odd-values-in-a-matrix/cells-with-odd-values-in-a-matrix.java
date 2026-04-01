class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < indices.length; i++) {

            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }

        int oddRows = 0;
        for(int i = 0; i < m; i++) {
            if(row[i] % 2 == 1) {
                oddRows++;
            }
        }

        int oddCols = 0;
        for(int j = 0; j < n; j++) {
            if(col[j] % 2 == 1) {
                oddCols++;
            }
        }

        return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
    }
}