public class MaximumProductDifferenceBetweenTwoPairsII {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int i = maxProductDifference(nums);
        System.out.println(i);
    }

    public static int maxProductDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max) {
                max2 = max;
                max = i;
            } else if (i > max2) {
                max2 = i;
            }
            if (i < min) {
                min2 = min;
                min = i;
            } else if (i < min2) {
                min2 = i;
            }
        }
        return (max * max2) - (min * min2);
    }
}
