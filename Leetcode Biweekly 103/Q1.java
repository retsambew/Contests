/*
 * 2656. Maximum Sum With Exactly K Elements
 */

public class Q1 {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return (max * k) + (k * (k - 1) / 2);
    }
}
