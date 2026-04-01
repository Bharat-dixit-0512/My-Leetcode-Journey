class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        // Step 1: Create the matrix
        int[][] matrix = new int[n][m];
        
        // Step 2: Apply each operation directly
        for (int[] op : indices) {
            int row = op[0];
            int col = op[1];
            
            // Increment all cells in the given row
            for (int j = 0; j < m; j++) {
                matrix[row][j]++;
            }
            
            // Increment all cells in the given column
            for (int i = 0; i < n; i++) {
                matrix[i][col]++;
            }
        }
        
        // Step 3: Count odd cells
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}