/*
 * 6376. Row With Maximum Ones | Easy
 */

public class Q1 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ans[] = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            if (count > ans[1]) {
                ans[1] = count;
                ans[0] = i;
            }
        }
        return ans;
    }
}
