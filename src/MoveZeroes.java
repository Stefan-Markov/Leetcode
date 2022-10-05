import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] values = {0, 1, 0, 3, 12};

        moveZeroes(values);

        System.out.println(Arrays.toString(values));
    }

    public static void moveZeroes(int[] nums) {
//        if (nums == null || nums.length == 0) return;
//
//        for (int i = 0, cur = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int tmp = nums[cur];
//                nums[cur] = nums[i];
//                nums[i] = tmp;
//                cur++;
//            }
//        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        for (int i = nums.length - 1; i > nums.length - 1 - count; i--) {
            nums[i] = 0;
        }
    }
}
