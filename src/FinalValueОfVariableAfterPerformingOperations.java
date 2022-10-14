import java.util.Arrays;

public class FinalValueОfVariableAfterPerformingOperations {
    public static void main(String[] args) {

        String[] operations = {"--X", "X++", "X++"};
        int i = finalValueAfterOperations(operations);
        System.out.println(i);
    }

    public static int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations, 0, operations.length)
                .mapToInt(operation -> operation.charAt(1) == '+' ? 1 : -1)
                .sum();
    }
}
