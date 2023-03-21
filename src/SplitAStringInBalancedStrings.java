public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        var s = "RLRRLLRLRL";
        int i = balancedStringSplit(s);
        System.out.println(i);
    }

    public static int balancedStringSplit(String s) {
        if (s.length() == 0) {
            return 0;
        }

        var r = 0;
        var l = 0;
        var ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt == 'R') {
                r++;
            } else if (charAt == 'L') {
                l++;
            }
            if (r == l) {
                ans++;
            }
        }
        return ans;
    }
}
