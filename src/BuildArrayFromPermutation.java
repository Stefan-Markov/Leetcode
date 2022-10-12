import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ints = buildArray(nums);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
         
            int num = nums[nums[i]];
            ans[i] = num;
        }
        return ans;
    }

}
