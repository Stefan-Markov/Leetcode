public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        var input = "Let's take LeetCode contest";
        String res = reverseWords(input);
        System.out.println(res);
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s++");
        StringBuilder res = new StringBuilder();
        for (String value : words) {
            StringBuilder word = new StringBuilder(value).reverse();
            res.append(word).append(' ');
        }
        return res.toString().trim();
    }
}
