public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {

//        String[] values = {"abc", "car", "ada", "racecar", "cool"};
        String[] values = {"notapalindrome", "racecar"};

        String s = firstPalindrome(values);
        System.out.println(s);
    }

    public static String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            boolean isPalindrome = true;
            String word = words[i];

            int end = word.length() - 1;
            for (int j = 0; j < word.length() / 2; j++, --end) {
                char first = word.charAt(j);
                char second = word.charAt(end);
                if (first != second) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) return word;
        }
        return "";
    }

}
