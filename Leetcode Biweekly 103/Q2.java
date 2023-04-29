/*
 * 2657. Find the Prefix Common Array of Two Arrays
 */

public class Q2 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        if (A[0] == B[0])
            ans[0]++;
        for (int i = 1; i < A.length; i++) {
            ans[i] = ans[i - 1];
            for (int j = 0; j < i; j++) {
                if (A[i] == B[j])
                    ans[i]++;
                if (B[i] == A[j])
                    ans[i]++;
            }
            if (A[i] == B[i])
                ans[i]++;
        }
        return ans;
    }
}
