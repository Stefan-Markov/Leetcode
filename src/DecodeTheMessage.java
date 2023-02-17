import java.util.ArrayList;

public class DecodeTheMessage {
    public static void main(String[] args) {

        var key = "the quick brown fox jumps over the lazy dog";
        var message = "vkbs bs t suepuv";
        String decodeMessage = decodeMessage(key, message);
        System.out.println(decodeMessage);
    }

    public static String decodeMessage(String key, String message) {
        var res = new StringBuilder();
        var keyWithoutDuplicates = new ArrayList<>();

        for (int i = 0; i < key.length(); i++) {
            char symbol = key.charAt(i);
            if (!keyWithoutDuplicates.contains(symbol) && symbol != ' ')
                keyWithoutDuplicates.add(symbol);
        }
        for (int i = 0; i < message.length(); i++) {
            char symbol = message.charAt(i);
            if (symbol == ' ') {
                res.append(" ");
                continue;
            }
            int index = keyWithoutDuplicates.indexOf(symbol);
            res.append((char) ('a' + index));
        }
        return res.toString();
    }
}
