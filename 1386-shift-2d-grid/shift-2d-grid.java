class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        for (int step = 0; step < k; step++) {
            int[][] newGrid = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n - 1) {
                        if (i == m - 1) {
                            newGrid[0][0] = grid[i][j];
                        } else {
                            newGrid[i + 1][0] = grid[i][j];
                        }
                    } else {
                        newGrid[i][j + 1] = grid[i][j];
                    }
                }
            }
            grid = newGrid;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                l.add(grid[i][j]);
            }
            ans.add(l);
        }
        return ans;
    }
}
