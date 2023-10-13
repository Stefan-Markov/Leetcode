public class SumOfSquaresOfSpecialElements {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    int i = sumOfSquares(nums);
    System.out.println(i);
  }

  public static int sumOfSquares(int[] nums) {
    int sum = 0;
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (length % (i + 1) == 0) {
        sum += nums[i] * nums[i];
      }
    }
    return sum;
  }
}
