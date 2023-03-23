import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWordsII {
    public static void main(String[] args) {
        var words = new String[]{"gin", "zen", "gig", "msg"};

        int i = uniqueMorseRepresentations(words);
        System.out.println(i);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String str : words) {
            StringBuilder sb = new StringBuilder();
            for (char symbol : str.toCharArray()) {
                sb.append(morse[symbol - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
