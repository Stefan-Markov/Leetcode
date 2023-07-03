import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

  public static void main(String[] args) {
    var s = "leetcode";
    List<String> wordDict = List.of("leet", "code");
    boolean b = wordBreak(s, wordDict);
    System.out.println(b);
  }

  public static boolean wordBreak(String s, List<String> wordDict) {
    Map<String, Boolean> map = new HashMap<>();
    return canConstruct(s, wordDict, map);
  }

  public static boolean canConstruct(String target, List<String> words, Map<String, Boolean> map) {
    if (map.containsKey(target)) {
      return map.get(target);
    }
    if (target.isEmpty()) {
      return true;
    }
    for (String word : words) {
      if (target.startsWith(word) && (canConstruct(target.substring(word.length()), words, map))) {
        map.put(target, true);
        return true;
      }
    }

    map.put(target, false);
    return false;
  }
}
