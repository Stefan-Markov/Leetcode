import java.util.HashMap;

public class NumberOfGoodPairs_Map {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        int i = numIdenticalPairs(nums);
        System.out.println(i);
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int count = 0;

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1);
            } else {
                count += mp.get(num);
                mp.put(num, mp.get(num) + 1);
            }
        }

        return count;
    }
}
