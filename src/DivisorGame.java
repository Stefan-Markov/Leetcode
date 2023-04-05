public class DivisorGame {
    public static void main(String[] args) {
        var n = 8;
        boolean b = divisorGame(n);
        System.out.println(b);
    }

    public static boolean divisorGame(int n) {
//        return n % 2 == 0;
        return n != 1 && !divisorGame(n - 1);
    }
}
