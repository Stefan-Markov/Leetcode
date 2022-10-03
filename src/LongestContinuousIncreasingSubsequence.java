public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 4, 7};

        int i = findLengthOfLCIS(nums);
        System.out.println(i);
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int counter = 1;
        if (nums == null || nums.length == 0) return max;
        if (nums.length == 1) return counter;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}
