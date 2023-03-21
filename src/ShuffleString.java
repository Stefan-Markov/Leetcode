import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {

        var s = "codeleet";
        var indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        String s1 = restoreString(s, indices);
        System.out.println(s1);
    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            char charAt = s.charAt(i);
            arr[index] = charAt;
        }
        return new String(arr);
    }
}
