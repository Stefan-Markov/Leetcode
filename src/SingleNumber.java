import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};

        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
