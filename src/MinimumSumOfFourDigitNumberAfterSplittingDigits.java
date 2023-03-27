import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        var num = 2932;
        int i = minimumSum(num);
        System.out.println(i);
    }

    public static int minimumSum(int num) {
//        int[] arr = new int[4];
//        int i = 0;
//        while (num > 0) {
//            arr[i] = num % 10;
//            num /= 10;
//            i++;
//        }
//        Arrays.sort(arr);


        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        Integer first = Integer.valueOf("" + arr[0] + arr[2]);
        Integer second = Integer.valueOf("" + arr[1] + arr[3]);
        return first + second;
    }
}
