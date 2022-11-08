import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> list = addToArrayForm(num, k);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int n : num) {
            stringBuilder.append(n);
        }

        BigInteger a = new BigInteger(stringBuilder.toString());
        BigInteger ks = new BigInteger(String.valueOf(k));
        String res = String.valueOf(a.add(ks));

        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < res.length(); i++) {
            resultArray.add(res.charAt(i) - 48);
        }
        return resultArray;
    }
}
