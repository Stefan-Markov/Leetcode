import java.util.Arrays;

public class ReverseArrayWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        var start = 0;
        var end = arr.length - 1;
        reverseArrayRecursion(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArrayRecursion(int[] arr, int pointerStart, int pointerEnd) {
        if (pointerStart > pointerEnd) {
            return;
        }

        int temp = arr[pointerStart];
        arr[pointerStart] = arr[pointerEnd];
        arr[pointerEnd] = temp;

        reverseArrayRecursion(arr, pointerStart + 1, pointerEnd - 1);
    }
}
