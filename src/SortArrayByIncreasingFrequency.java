import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 2, 3};

        int[] ints = frequencySort(nums);

        System.out.println(Arrays.toString(ints));

    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
        return Arrays.stream(nums).boxed()
                .sorted((a, b) -> !Objects.equals(map.get(a), map.get(b)) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }
}
