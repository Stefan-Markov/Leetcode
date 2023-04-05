public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
//        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int i = minCostClimbingStairs(cost);
        System.out.println(i);
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < cost.length; i++) {
            int step = cost[i];
            int lookOneStepBack = cost[i - 1];
            int lookTwoStepsBack = cost[i - 2];
            // Aggregate steps result on current step
            cost[i] = Math.min(lookOneStepBack, lookTwoStepsBack) + step;
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }
}
