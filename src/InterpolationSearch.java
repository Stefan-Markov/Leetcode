public class InterpolationSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 8;
        int index = interpolationSearch(arr, number);

        if (index != -1) {
            System.out.println("Result found at index: " + index);
        } else {
            System.out.println("No result for found: " + number);
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
