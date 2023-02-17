public class StrongPasswordChecker {
    public static void main(String[] args) {
        var password = "a";
        int i = strongPasswordChecker(password);
        System.out.println(i);
    }

    public static int strongPasswordChecker(String password) {
        int missingType = 3;
        if (password.matches(".*[a-z].*")) {
            missingType--;
        }
        if (password.matches(".*[A-Z].*")) {
            missingType--;
        }
        if (password.matches(".*[0-9].*")) {
            missingType--;
        }
        int change = 0;
        int one = 0;
        int two = 0;
        for (int i = 2; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)
                    && password.charAt(i - 1) == password.charAt(i - 2)) {
                int length = 2;
                while (i < password.length() && password.charAt(i) == password.charAt(i - 1)) {
                    length++;
                    i++;
                }
                change += length / 3;
                if (length % 3 == 0) {
                    one++;
                } else if (length % 3 == 1) {
                    two++;
                }
            }
        }
        var length = password.length();
        if (length < 6) {
            return Math.max(missingType, 6 - length);
        }
        if (length <= 20) {
            return Math.max(missingType, change);
        }
        int delete = length - 20;
        change -= Math.min(delete, one);
        change -= Math.min(Math.max(delete - one, 0), two * 2) / 2;
        change -= Math.max(delete - one - 2 * two, 0) / 3;
        return delete + Math.max(missingType, change);
    }
}
