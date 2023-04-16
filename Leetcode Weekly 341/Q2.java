/*
 * 6350. Find the Maximum Divisibility Score | Easy
 */

public class Q2 {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int maxElement = -1;
        for (int i = 0; i < divisors.length; i++) {
            int score = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0)
                    score++;
            }
            if (score == maxScore)
                maxElement = Math.min(maxElement, divisors[i]);
            else if (score > maxScore) {
                maxScore = score;
                maxElement = divisors[i];
            }
        }
        return maxElement;
    }
}
