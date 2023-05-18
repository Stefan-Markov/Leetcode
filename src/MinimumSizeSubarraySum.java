public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        var target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int i = minSubArrayLen(target, nums);
        System.out.println(i);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0, end = 0, sum = 0, minLength = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end++];
            while (sum >= target) {
                minLength = Math.min(minLength, end - start);
                sum -= nums[start++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
