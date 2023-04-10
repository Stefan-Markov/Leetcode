import java.util.Arrays;

public class InPlaceReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] ints = reverseArrayOnPlace(arr);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] reverseArrayOnPlace(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
