import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

  public static void main(String[] args) {
    var s = "ababbc";
    var k = 2;
    int i = longestSubstring(s, k);
    System.out.println(i);

    var s1 = "aaabb";
    var k1 = 3;
    int i1 = longestSubstring(s1, k1);
    System.out.println(i1);
  }

  public static int longestSubstring(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int ans = 0;
    while (ans < s.length() && map.get(s.charAt(ans)) >= k) {
      ans++;
    }

    if (ans == s.length()) {
      return ans;
    }

    int left = longestSubstring(s.substring(0, ans), k);
    int right = longestSubstring(s.substring(ans + 1), k);

    return Math.max(left, right);
  }
}
