import java.util.HashMap;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {
        String input = "abccbaacz";

        char c = repeatedCharacter(input);

        System.out.println(c);
    }

    public static char repeatedCharacter(String input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            map.putIfAbsent(symbol, 0);
            map.put(symbol, map.get(symbol) + 1);
            if (map.get(symbol) == 2) {
                return input.charAt(i);
            }
        }
        return map.keySet().stream().findFirst().get();
    }
}
