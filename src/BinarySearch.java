public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 7, 10, 40};
        int number = 10;
        int result = binarySearch(arr, 0, arr.length - 1, number);
        if (result != -1) {
            System.out.println("Result fount at index: " + result);
        } else {
            System.out.println("No result found");
        }
    }

    private static int binarySearch(int[] arr, int start, int end, int number) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == number) {
                return mid;
            }

            if (arr[mid] > number) {
                return binarySearch(arr, start, mid - 1, number);
            }

            return binarySearch(arr, mid + 1, end, number);
        }
        return -1;
    }
}
