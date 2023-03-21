import java.util.*;
import java.util.function.Predicate;

public class CheckForAnagrams {

    private static final Predicate<Set<String>> sizeMoreThanOne = v -> v.size() > 1;

    private static final Map<String, Set<String>> anagrams = new HashMap<>();

    private static final List<String> values = List.of("Бира", "Риба", "кавалер",
            "акварел", "кола", "мотор", "боб", "боб");

    public static void main(String[] args) {
        listAnagrams(values);
    }

    public static void listAnagrams(List<String> words) {

        for (String word : words) {
            String sorted = sortByCharacter(word);
            anagrams.putIfAbsent(sorted, new HashSet<>());
            anagrams.get(sorted).add(word);
        }

        anagrams
                .values()
                .stream()
                .filter(sizeMoreThanOne)
                .forEach(System.out::println);
    }

    private static String sortByCharacter(String word) {
        String str = word.toLowerCase().trim();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
