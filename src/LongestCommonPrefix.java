import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"dog", "racecar", "car"};

        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder builder = new StringBuilder();
        int n = strs.length;
        Arrays.sort(strs);
        String s = strs[0];
        String h = strs[n - 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != h.charAt(i)) {
                break;
            }
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

}
