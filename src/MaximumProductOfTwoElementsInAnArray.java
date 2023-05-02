public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        int i = maxProduct(nums);
        System.out.println(i);
    }

    public static int maxProduct(int[] nums) {
        int maxFirst = 0;
        int maxSecond = 0;
        int result;
        for (int num : nums) {
            if (num > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxSecond = num;
            }
        }
        result = (maxFirst - 1) * (maxSecond - 1);
        return result;
    }
}
