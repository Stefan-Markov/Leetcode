import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingTheSentence {
    public static void main(String[] args) {
        var s = "is2 sentence4 This1 a3";
        String res = sortSentence(s);
        System.out.println(res);
    }

    public static String sortSentence(String s) {
        return Arrays.stream(s.split("\\s++"))
                .sorted((a, b) -> {
                    Integer first = (int) a.charAt(a.length() - 1);
                    Integer second = (int) b.charAt(b.length() - 1);
                    return first - second;
                })
                .map(e -> e.substring(0, e.length() - 1))
                .collect(Collectors.joining(" "));
    }
}
