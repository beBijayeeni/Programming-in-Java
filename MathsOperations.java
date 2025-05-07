
package mathop;

public class MathsOperations{
    public static int max(int[] nums) {
        int m = nums[0];
        for (int n : nums) {
            if (n > m) {
                m = n;
            }
        }
        return m;
    }
    public static int min(int[] nums) {
        int m = nums[0];
        for (int n : nums) {
            if (n < m) {
                m = n;
            }
        }
        return m;
    }
}
