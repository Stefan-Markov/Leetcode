public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        int columnNumber = 30;
        String s = convertToTitle(columnNumber);
        System.out.println(s);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber-- > 0) {

            ans.insert(0, (char) ('A' + (columnNumber % 26)));
            columnNumber = columnNumber / 26;
        }
        return ans.toString();
    }
}
