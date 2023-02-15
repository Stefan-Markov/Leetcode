import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        var sentences = new String[]
                {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int i = mostWordsFound(sentences);
        System.out.println(i);
    }

    public static int mostWordsFound(String[] sentences) {
        int max = -1;
        for (String s : sentences) {
            Long sentence = Arrays.stream(s.split("\\s+")).count();
            max = Math.max(max, sentence.intValue());
        }
        return max;
    }
}
