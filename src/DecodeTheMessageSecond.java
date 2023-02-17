import java.util.HashMap;
import java.util.stream.Collectors;

public class DecodeTheMessageSecond {
    public static void main(String[] args) {
        var key = "the quick brown fox jumps over the lazy dog";
        var message = "vkbs bs t suepuv";
        String decodeMessage = decodeMessage(key, message);
        System.out.println(decodeMessage);
    }

    public static String decodeMessage(String key, String message) {
        var m = new HashMap<>();
        m.put(' ', ' ');
        char to = 'a';
        for (char from : key.toCharArray())
            if (!m.containsKey(from))
                m.put(from, to++);
        return message.chars().mapToObj(c -> m.get((char) c) + "").collect(Collectors.joining(""));
    }
}
