import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] res = intersection(nums1, nums2);
    System.out.println(Arrays.toString(res));
  }

  public static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> container = new HashSet<>();
    HashSet<Integer> output = new HashSet<>();

    for (int num : nums1) {
      container.add(num);
    }
    for (int num : nums2) {
      if (container.contains(num)) {
        output.add(num);
      }
    }

    int[] outputArray = new int[output.size()];
    int index = 0;
    for (int x : output) {
      outputArray[index] = x;
      index++;
    }

    return outputArray;
  }
}
