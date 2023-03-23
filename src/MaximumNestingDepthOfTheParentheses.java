public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        var s = "(1+(2*3)+((8)/4))+1";
        int i = maxDepth(s);
        System.out.println(i);
    }

    public static int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == '(') {
                res++;
            } else if (ch == ')') {
                res--;
            }
            max = Math.max(max, res);
        }
        return max;
    }
}
