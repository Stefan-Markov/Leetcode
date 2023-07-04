import java.util.Arrays;

public class LargestNumber {

  public static void main(String[] args) {
    var nums = new int[]{10, 2};
    System.out.println(largestNumber(nums));
  }

  public static String largestNumber(int[] nums) {
    String[] s = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      s[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(s, (a, b) -> {
      String o1 = a + b;
      String o2 = b + a;
      return o2.compareTo(o1);
    });
    return s[0].equals("0") ? "0" : String.join("", s);
  }
}
