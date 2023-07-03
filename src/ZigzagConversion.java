public class ZigzagConversion {
    public static void main(String[] args) {
        var s = "PAYPALISHIRING";
        var numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        int k = numRows * 2 - 2;
        StringBuilder res = new StringBuilder();

        if (numRows == 1 || numRows >= s.length() || s.length() == 1) return s;

        for (int i = 0; i < numRows; i++) {
            int left = i;
            int right = k - i;
            if (i == 0 || i == numRows - 1) right = s.length();
            for (int j = 0; j < s.length() / numRows + 1; j++) {
                if (left < s.length()) {
                    res.append(s.charAt(left));
                }

                if (right < s.length()) {
                    res.append(s.charAt(right));
                }

                left += k;
                right += k;
            }
        }
        return res.toString();
    }
}
