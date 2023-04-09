import java.util.*;

public class ReverseStringToSide {
    public static void main(String[] args) {
        var sentence = "This is new car";
        // left right up down
        String direction = "up";
        List<String> result = reverseStringToDirection(sentence, direction);
        result.forEach(System.out::println);
    }

    private static List<String> reverseStringToDirection(String sentence, String direction) {
        String[] words = sentence.split("\\s+");
        List<String> solution = new ArrayList<>(words.length);

        switch (direction) {
            case "right" -> solution.addAll(Arrays.asList(words));
            case "left" -> {
                for (String word : words) {
                    StringBuffer sb = new StringBuffer(word).reverse();
                    solution.add(sb.toString());
                }
            }
            case "up" -> {
                reverseWords(words, solution);
                Collections.reverse(solution);

            }
            case "down" -> reverseWords(words, solution);
            default -> throw new IllegalArgumentException("not valid direction");
        }
        ;
        return solution;
    }

    private static void reverseWords(String[] words, List<String> solution) {
        int max = Arrays.stream(words)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .get();

        int pointer = 0;
        int length = words.length;
        for (int i = 0; i < length; i++) {
            if (pointer == length) {
                break;
            }

            String word = words[pointer];
            if (word.length() == i) {
                for (int j = i; j < max; j++) {
                    solution.set(j, solution.get(j) + " ");
                }
                pointer++;
                i = -1;
                continue;
            }
            char value = word.charAt(i);

            if (pointer > 0) {
                solution.set(i, solution.get(i) + value);
            } else {
                solution.add(i, String.valueOf(value));
            }
            if (i == length - 1) {
                pointer++;
                i = -1;
            }

        }

    }
}
