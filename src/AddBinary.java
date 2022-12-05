import java.math.BigDecimal;
import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
//        String a = "11"
//        String b = "1";

        String a = "1010";
        String b = "1011";

        String s = addBinary(a, b);
        System.out.println(s);
    }

    public static String addBinary(String a, String b) {
        return new BigInteger(a, 2)
                .add(new BigInteger(b, 2))
                .toString(2);
    }
}
