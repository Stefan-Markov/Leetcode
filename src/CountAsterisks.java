public class CountAsterisks {
    public static void main(String[] args) {
        var s = "l|*e*et|c**o|*de|";
        int i = countAsterisks(s);
        System.out.println(i);
    }

    public static int countAsterisks(String s) {
        int barCount = 0;
        int asteriskCount = 0;
        for (char ch : s.toCharArray()) {
            barCount += ch == '|' ? 1 : 0;
            asteriskCount += barCount == 0 && ch == '*' ? 1 : 0;
            barCount = barCount == 2 ? 0 : barCount;
        }
        return asteriskCount;
    }
}
