public class MinimizeStringLength {

  public static void main(String[] args) {
    var s = "aaabc";
    int i = minimizedStringLength(s);
    System.out.println(i);
  }

  public static int minimizedStringLength(String s) {
    var memory = new boolean[26];
    var ans = 0;

    for (var c : s.toCharArray()) {
      memory[c - 'a'] = true;
    }

    for (var c : memory) {
      if (c) {
        ans++;
      }
    }

    return ans;
  }
}
