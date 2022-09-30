public class LongestSubstringWithoutRepeatCharactersFastest {
    public static void main(String[] args) {
        System.out.println(solution("abbbababcd"));
    }

    public static int solution(String s) {
        int maxLength = 0;

        for (int right = 0, left = 0; right < s.length(); right++) {
            char symbol = s.charAt(right);
            int locationOfFirstIndex = s.indexOf(symbol, left);

            if (locationOfFirstIndex != right) {
                left = locationOfFirstIndex + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}
