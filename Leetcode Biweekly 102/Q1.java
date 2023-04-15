/**
 * 6333. Find the Width of Columns of a Grid
 */
public class Q1 {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int x = Integer.toString(grid[i][j]).length();
                if (x > ans[j])
                    ans[j] = x;
            }
        }
        return ans;
    }
}