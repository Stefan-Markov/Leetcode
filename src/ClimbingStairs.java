import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 15;
        int i = climbStairs(n);
        System.out.println(i);
    }

    public static int distinctWays(int n, int[] dp) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = distinctWays(n - 1, dp) + distinctWays(n - 2, dp);
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return distinctWays(n, dp);
    }
}
