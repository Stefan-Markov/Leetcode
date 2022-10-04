import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {

        String input = "ababcbacadefegdehijhklij";
        List<Integer> list = partitionLabels(input);

        for (Integer a : list) {
            System.out.print(a);
            System.out.print(" ");
        }
    }

    public static List<Integer> partitionLabels(String s) {
        char[] ch = s.toCharArray();

        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[ch[i] - 'a'] = i;
        }

        List<Integer> list = new ArrayList<>();

        int end = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            int pos = last[ch[i] - 'a'];

            if (pos > end) end = pos;

            if (i == end) {
                list.add(end - start + 1);
                start = end + 1;

            }
        }
        return list;
    }
}
