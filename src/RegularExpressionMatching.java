public class RegularExpressionMatching {
    public static void main(String[] args) {
        var s = "aa";
        var p = "a";
        boolean match = isMatch(s, p);
        System.out.println(match);
    }

    public static boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}
