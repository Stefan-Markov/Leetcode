import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
//      String[]  word1 = {"ab", "c"}, word2 = {"a", "bc"};
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        boolean b = arrayStringsAreEqual(word1, word2);
        System.out.println(b);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int word1Pointer = 0, word2Pointer = 0;
        int string1Pointer = 0, string2Pointer = 0;

        while (word1Pointer < word1.length && word2Pointer < word2.length) {
            char charOne = word1[word1Pointer].charAt(string1Pointer++);
            char charTwo = word2[word2Pointer].charAt(string2Pointer++);
            if (charOne != charTwo) {
                return false;
            }

            if (string1Pointer == word1[word1Pointer].length()) {
                word1Pointer++;
                string1Pointer = 0;
            }

            if (string2Pointer == word2[word2Pointer].length()) {
                word2Pointer++;
                string2Pointer = 0;
            }
        }
        return word1Pointer == word1.length && word2Pointer == word2.length;
    }
}
