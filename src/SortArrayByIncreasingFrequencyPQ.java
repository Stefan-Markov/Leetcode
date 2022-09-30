import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequencyPQ {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 2, 3};

        int[] ints = frequencySort(nums);

        System.out.println(Arrays.toString(ints));

    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = 0;
        int[] result = new int[nums.length];
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                nums.length, (a, b) -> map.get(a).equals(map.get(b))
                ? b - a :
                map.get(a) - map.get(b));
        pq.addAll(map.keySet());
        while (pq.size() > 0) {
            int num = pq.poll();
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) {
                result[m++] = num;
            }
        }
        return result;
    }
}
