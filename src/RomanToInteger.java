public class RomanToInteger {
    public static void main(String[] args) {

//        String input = "III";
        String input = "LVIII";

        int i = romanToInt(input);
        System.out.println(i);
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            result += getNumber(s.charAt(i), s.charAt(i + 1));
        }
        result += getNumber(s.charAt(s.length() - 1), ' ');
        return result;
    }

    private static int getNumber(char current, char next) {
        return switch (current) {
            case 'M' -> +1000;
            case 'D' -> +500;
            case 'C' -> next == 'M' || next == 'D' ? -100 : 100;
            case 'L' -> +50;
            case 'X' -> next == 'C' || next == 'L' ? -10 : 10;
            case 'V' -> +5;
            case 'I' -> next == 'X' || next == 'V' ? -1 : 1;
            default -> 0;
        };
    }
}
