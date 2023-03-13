public class RepeatedSubstringPattern {
    public static void main(String[] args) {

//        var s = "abab";
        var s = "1212";
//        var s = "aba";
        boolean b = repeatedSubstringPattern(s);
        System.out.println(b);
    }

    public static boolean repeatedSubstringPattern(String s) {
        var str = s + s;
        int endIndex = str.length();
        var result = str.substring(1, endIndex - 1);
        return result.contains(s);
    }
}
