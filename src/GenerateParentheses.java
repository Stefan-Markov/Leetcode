import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        var n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack("", n, n, ans);
        return ans;
    }

    private static void backtrack(String s, int open, int close, List<String> ans) {
        //base case
        if (open > close) {
            return;
        }
        if (open > 0) {
            backtrack(s + "(", open - 1, close, ans);
        }
        if (close > 0) {
            backtrack(s + ")", open, close - 1, ans);
        }
        if (open == 0 && close == 0) {
            ans.add(s);
        }
    }
}
