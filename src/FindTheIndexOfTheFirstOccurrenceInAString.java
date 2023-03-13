public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        var haystack = "sadbutsad";
        var needle = "sad";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
//        if (haystack.contains(needle)) {
//            return haystack.indexOf(needle);
//        }

        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
