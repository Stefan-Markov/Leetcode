public class CountSortedVowelStrings {
    public static void main(String[] args) {
        var n = 33;
        int i = countVowelStrings(n);
        System.out.println(i);
    }

    private static int a = 1;
    private static int e = 1;
    private static int i = 1;
    private static int o = 1;
    private static final int u = 1;

    public static int countVowelStrings(int n) {
        for (int j = 1; j < n; j++) {
            increment();
        }
        return a + e + i + o + u;
    }

    private static void increment() {
        // u          1
        o = o + u; // 2
        i = i + o; // 3
        e = e + i; // 4
        a = a + e; // 5
    }
}
