import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        var sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean b = checkIfPangram(sentence);
        System.out.println(b);
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);
            set.add(c);
        }
        return set.size() == 26;
    }
}
