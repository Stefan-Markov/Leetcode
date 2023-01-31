import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] ints = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i])
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
