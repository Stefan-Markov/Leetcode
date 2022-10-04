public class PalindromeNumberSecond {
    public static void main(String[] args) {
        int num = 121;
//        int num = 123;

        boolean palindrome = isPalindrome(num);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        char[] xArr = ("" + x).toCharArray();

        int j = xArr.length;
        int i = 0;
        while (i < xArr.length && j >= 0) {
            if (xArr[i] != xArr[j - 1]) return false;
            i++;
            j--;
        }
        return true;
    }
}
