public class ValidAnagram {

  public static void main(String[] args) {
    var s = "anagram";
    var t = "nagaram";
    boolean anagram = isAnagram(s, t);
    System.out.println(anagram);
  }

  public static boolean isAnagram(String s, String t) {
    int a = s.length();
    int b = t.length();
    if (a != b) {
      return false;
    }
    int[] memory = new int[26];
    for (int i = 0; i < a; i++) {
      memory[s.charAt(i) - 'a']++;
      memory[t.charAt(i) - 'a']--;
    }
    for (int i : memory) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }
}
