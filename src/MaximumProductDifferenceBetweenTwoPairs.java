import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int i = maxProductDifference(nums);
        System.out.println(i);
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int firstLow = nums[0];
        int secondLow = nums[1];
        int firstHigh = nums[nums.length - 1];
        int secondHigh = nums[nums.length - 2];
        return (firstHigh * secondHigh) - (firstLow * secondLow);
    }
}
