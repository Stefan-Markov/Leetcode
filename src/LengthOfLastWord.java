public class LengthOfLastWord {
    public static void main(String[] args) {

        String input = "Hello World";

        int i = lengthOfLastWord(input);
        System.out.println(i);
    }

    public static int lengthOfLastWord(String s) {
        int flag = 1;
        s = s.trim();

        for (int i = s.lastIndexOf(" ") + 1; i < s.length() - 1; i++) {
            flag++;
        }
        return flag;
    }
}
