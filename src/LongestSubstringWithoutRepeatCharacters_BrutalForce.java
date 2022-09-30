public class LongestSubstringWithoutRepeatCharacters_BrutalForce {
    public static void main(String[] args) {
        System.out.println(solution("abbbababcd"));
    }

    public static int solution(String s) {
        int maxLength = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (current.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                current.append(s.charAt(j));
                if (current.length() > maxLength) maxLength = current.length();
            }
        }
        System.out.println(current);
        return maxLength;
    }
}
