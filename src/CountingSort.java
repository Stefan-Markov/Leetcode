import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 2, 20, 4};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            } else if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
        int[] counts = new int[max - min + 1];
        for (int j : arr) {
            counts[j - min]++;
        }
        int sortedIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[sortedIndex++] = i + min;
                counts[i]--;
            }
        }
    }
}
