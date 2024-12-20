public class GoalParserInterpretation {
    public static void main(String[] args) {
        var command = "G()(al)";
        String interpret = interpret(command);
        System.out.println(interpret);
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
