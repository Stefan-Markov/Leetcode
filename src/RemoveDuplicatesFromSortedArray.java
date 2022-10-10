public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] values = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(values);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        int k = 1;
        while (i < (nums.length - 1)) {
            if (nums[i + 1] != nums[i]) {
                nums[k] = nums[i + 1];
                k++;
            }
            i++;
        }
        return k;

    }
}
