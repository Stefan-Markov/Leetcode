import java.util.Arrays;
import java.util.HashMap;

public class MakeArrayEmpty {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1};
        long l = countOperationsToEmptyArray(nums);
        System.out.println(l);
    }

    public static long countOperationsToEmptyArray(int[] nums) {
        HashMap<Integer, Integer> position = new HashMap<>();
        long length = nums.length;
        var res = length;
        for (int i = 0; i < length; i++) {
            position.put(nums[i], i);
        }
        Arrays.sort(nums);

        for (int i = 1; i < length; i++) {
            int firstNum = nums[i];
            int secondNum = nums[i - 1];
            Integer firstPosition = position.get(firstNum);
            Integer secondPosition = position.get(secondNum);

            if (firstPosition < secondPosition) {
                res += length - i;
            }
        }
        return res;
    }
}
