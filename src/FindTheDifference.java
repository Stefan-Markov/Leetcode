public class FindTheDifference {

  public static void main(String[] args) {

    var s = "abcd";
    var t = "abcde";
    char c = findTheDifference(s, t);
    System.out.println(c);
  }

  public static char findTheDifference(String s, String t) {
    int[] memory = new int[26];
    for (int i = 0; i < s.length(); i++) {
      memory[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
      memory[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < memory.length; i++) {
      if (memory[i] < 0) {
        return (char) (i + 'a');
      }
    }
    return ' ';
  }
}
