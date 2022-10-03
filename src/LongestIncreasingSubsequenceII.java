import java.util.*;

public class LongestIncreasingSubsequenceII {
    public static void main(String[] args) {

//        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
//        int k = 3;

        int[] nums = {7,4,5,1,8,12,4,7};
        int k = 5;

        int i = lengthOfLIS(nums, k);
        System.out.println(i);

    }

    public static int lengthOfLIS(int[] nums, int k) {
        int count = 1;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (min <= num && num - min <= k) {
                min = num;
                count++;
            }
        }
        return count;
    }
}
