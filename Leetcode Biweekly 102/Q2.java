/*
 * 6334. Find the Score of All Prefixes of an Array
 */

public class Q2 {
    public long[] findPrefixScore(int[] nums) {
        long ans[] = new long[nums.length];
        long sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            sum = sum + nums[i] + max;
            ans[i] = sum;
        }
        return ans;
    }
}