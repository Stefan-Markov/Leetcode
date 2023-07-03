import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

  public static void main(String[] args) {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    int[] res = nextGreaterElement(nums1, nums2);
    System.out.println(Arrays.toString(res));
  }

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      for (int j = i; j < nums2.length; j++) {
        if (nums2[j] > nums2[i]) {
          map.put(nums2[i], nums2[j]);
          break;
        } else if (j == nums2.length - 1) {
          map.put(nums2[i], -1);
        }
      }
    }
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = map.get(nums1[i]);
    }
    return nums1;
  }
}
