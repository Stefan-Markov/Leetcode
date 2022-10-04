import java.util.Objects;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;
//        int num = 123;

        boolean palindrome = isPalindrome(num);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {

        int sum = 0;
        int t = x;
        if (t >= 0) {
            while (t != 0) {
                int r = t % 10;
                sum = sum * 10 + r;
                t = t / 10;
            }
            return sum == x;
        }
        return false;
    }
}
