import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        var n = 8;
        int[] ints = countBits(n);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int two = 0;
        int nxt = 2;
        for (int i = 1; i <= n; i++) {
            if (i == nxt) {
                two = nxt;
                nxt *= 2;
                dp[i] = 1;
            } else {
                dp[i] = 1 + dp[i - two];
            }
        }
        return dp;
    }
}
