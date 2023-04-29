import java.util.ArrayList;
import java.util.Collections;

/*
 * 6390. Sliding Subarray Beauty
 */

public class Q3 {
    // TLE
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] arr = new int[nums.length - k + 1];
        ArrayList<Integer> window = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            window.add(nums[i]);
        }
        int j = 0;
        Collections.sort(window);
        arr[j++] = Math.min(window.get(x - 1), 0);
        for (int i = k; i < nums.length; i++) {
            window.remove(window.indexOf(nums[i - k]));
            window.add(nums[i]);
            Collections.sort(window);
            arr[j++] = Math.min(window.get(x - 1), 0);
        }
        return arr;
    }
}
