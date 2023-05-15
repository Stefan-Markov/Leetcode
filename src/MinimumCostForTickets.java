public class MinimumCostForTickets {
    public static void main(String[] args) {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        int i = mincostTickets(days, costs);
        System.out.println(i);
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int k = 0;
        for (int i = 1; k < days.length; i++) {
            if (i != days[k]) {
                dp[i] = dp[i - 1];
            } else {
                int daypass = i - 1 > 0 ? dp[i - 1] + costs[0] : costs[0];
                int weekpass = i - 7 > 0 ? dp[i - 7] + costs[1] : costs[1];
                int monthpass = i - 30 > 0 ? dp[i - 30] + costs[2] : costs[2];

                dp[i] = Math.min(monthpass, Math.min(weekpass, daypass));
                k++;
            }
        }
        k = days[days.length - 1];
        return dp[k];
    }
}
