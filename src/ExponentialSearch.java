public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 7, 10, 40};
        int size = arr.length;
        int number = 10;
        int result = exponentialSearch(arr, size, number);
        if (result != -1) {
            System.out.println("Result fount at index: " + result);
        } else {
            System.out.println("No result found");
        }
    }

    private static int exponentialSearch(int[] arr, int n, int x) {
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
