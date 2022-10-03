import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimalPartitionOfString {
    public static void main(String[] args) {

        String input = "abacaba";
//        String input = "ssssss";

        int i = partitionString(input);
        System.out.println(i);
    }

    public static int partitionString(String s) {
        int res = 0;
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (visited[c - 'a']) {
                visited = new boolean[26];
                res++;
            }
            visited[c - 'a'] = true;
        }
        for (boolean b : visited) {
            if (b) {
                res++;
                break;
            }
        }
        return res;
    }
}
