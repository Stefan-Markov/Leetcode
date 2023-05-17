public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        int i = numberOfSteps(num);
        System.out.println(i);
    }

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
