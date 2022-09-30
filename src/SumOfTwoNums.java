import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNums {
    public static void main(String[] args) {
        // input
        int[] digits = {0, 2, 5, 4};
        int target = 6;

        int[] solution = twoSum(digits, target);

        System.out.println(solution[0] + " " + solution[1]);
    }

    public static int[] twoSum(int[] digits, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < digits.length / 2; i++) {

            Integer index = numbers.get(digits[i]);
            if (index != null) {
                return new int[]{i, index};
            }
            numbers.put(target - digits[i], i);
        }
        return digits;
    }
}
