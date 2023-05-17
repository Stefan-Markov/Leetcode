public class SmallestEvenMultiple {
    public static void main(String[] args) {
        var n = 5;
        int i = smallestEvenMultiple(n);
        System.out.println(i);
    }

    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
