import java.util.Arrays;

public class MinimumNumberOMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};

        int i = minMovesToSeat(seats, students);
        System.out.println(i);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            int dif = Math.abs(seats[i] - students[i]);
            ans += dif;
        }
        return ans;
    }
}
