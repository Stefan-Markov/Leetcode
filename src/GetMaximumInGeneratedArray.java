import java.util.Arrays;

public class GetMaximumInGeneratedArray {
    public static void main(String[] args) {
        var n = 2;
        int maximumGenerated = getMaximumGenerated(n);
        System.out.println(maximumGenerated);
    }

    public static int getMaximumGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        int max = 1;
        for (int i = 2; i <= n - 1; i += 2) {
            arr[i] = arr[i / 2];
            arr[i + 1] = arr[i / 2] + arr[i / 2 + 1];
            max = Math.max(max, arr[i + 1]);
        }
        return max;
    }
}
