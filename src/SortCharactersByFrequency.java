import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {

        String input = "tree";

        String s = frequencySort(input);
        System.out.println(s);

    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);

        for (char key : map.keySet()) {
            int f = map.get(key);
            pq.add(new Pair(key, f));
        }
        StringBuilder str = new StringBuilder();

        while (pq.size() > 0) {
            char key = pq.peek().data;
            int val = pq.poll().freq;
            while (val-- > 0) {
                str.append(key);
            }
        }
        return str.toString();
    }

    static class Pair {
        char data;
        int freq;

        Pair(char data, int freq) {
            this.data = data;
            this.freq = freq;
        }

    }
}
