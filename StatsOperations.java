
package statop;

import java.util.Arrays;

public class StatsOperations{
    public double average(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return (double) sum / nums.length;
    }
    public double median(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int mid = sorted.length / 2;
        if (sorted.length % 2 == 1) {
            return sorted[mid];
        } else {
            return (sorted[mid - 1] + sorted[mid]) / 2.0;
        }
    }
}
