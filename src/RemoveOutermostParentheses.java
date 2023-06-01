import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        var s = "(()())(())";
        String s1 = removeOuterParentheses(s);
        System.out.println(s1);
    }

    public static String removeOuterParentheses(String s) {
        Deque<Character> bracket = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (bracket.size() > 0) {
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            } else {
                bracket.pop();
                if (bracket.size() > 0) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
