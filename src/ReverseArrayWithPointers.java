import java.util.Arrays;

public class ReverseArrayWithPointers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseArrayPointers(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArrayPointers(int[] array) {
        var pointerEnd = array.length - 1;
        for (int pointerStart = 0; pointerStart < pointerEnd; pointerStart++, pointerEnd--) {
            int temp = array[pointerStart];
            array[pointerStart] = array[pointerEnd];
            array[pointerEnd] = temp;
        }
    }
}
