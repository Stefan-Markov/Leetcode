import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] ints = leftRigthDifference(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] leftRigthDifference(int[] nums) {
        int result = 0;
        int length = nums.length;
        int[] ans = new int[length];

        for (int i = 0; i < length; i++) {
            ans[i] = result;
            result += nums[i];
        }

        result = 0;

        for (int i = length - 1; i >= 0; i--) {
            ans[i] = Math.abs(ans[i] - result);
            result += nums[i];
        }

        return ans;
    }
}
