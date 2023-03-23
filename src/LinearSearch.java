public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 7, 10, 40};
        int number = 10;
        int result = linearSearch(arr, number);
        if (result != -1) {
            System.out.println("Result fount at index: " + result);
        } else {
            System.out.println("No result found");
        }

    }

    private static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
