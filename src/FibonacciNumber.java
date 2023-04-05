public class FibonacciNumber {
    public static void main(String[] args) {
        var n = 4;
        int fib = fib(n);
        System.out.println(fib);
    }

    //   public int fib(int n) {
    //        if(n<2){
    //        return n;
    //        }
    //       return fib(n-1)+fib(n-2);
    //    }
    public static int fib(int n) {
        return memorization(n, new Integer[n + 1]);
    }

    public static int memorization(int n, Integer[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != null)
            return dp[n];
        return dp[n] = memorization(n - 1, dp) + memorization(n - 2, dp);
    }
}
