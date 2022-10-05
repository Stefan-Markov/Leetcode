public class RemoveElement {
    public static void main(String[] args) {

        int[] values = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = 2;
        int i = removeElement(values, k);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int lastIndex = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[lastIndex++] = nums[i];
            }
        }
        return lastIndex;
    }
}
