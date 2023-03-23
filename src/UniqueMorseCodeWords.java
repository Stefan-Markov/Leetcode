import java.util.*;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        var words = new String[]{"gin", "zen", "gig", "msg"};

        int i = uniqueMorseRepresentations(words);
        System.out.println(i);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        var map = loadMorseTable();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder morseWord = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                morseWord.append(map.get(word.charAt(j)));
            }
            words[i] = morseWord.toString();
        }
        return new HashSet<>(Arrays.asList(words)).size();
    }

    private static Map<Character, String> loadMorseTable() {
        String[] morse = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        Map<Character, String> map = new HashMap<>();

        for (int i = 97, j = 0; i < 123; i++, j++) {
            map.put((char) i, morse[j]);
        }
        return map;
    }
}
