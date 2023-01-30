import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int i = numJewelsInStones(jewels, stones);
        System.out.println(i);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = jewels.toCharArray();
        for (char aChar : chars) {
            map.putIfAbsent(aChar, 0);
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
