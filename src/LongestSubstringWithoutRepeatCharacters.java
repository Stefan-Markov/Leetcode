import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatCharacters {
    public static void main(String[] args) {
        System.out.println(solution("abbbababcd"));
    }

    public static int solution(String s) {
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current) && map.get(current) >= left) {
                left = map.get(current) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            map.put(current, right);
        }

        return maxLength;
    }
}
