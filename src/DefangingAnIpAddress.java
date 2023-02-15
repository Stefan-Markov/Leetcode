public class DefangingAnIpAddress {
    public static void main(String[] args) {
        var address = "1.1.1.1";
        String s = defangIPaddr(address);
        System.out.println(s);
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char symbol = address.charAt(i);
            if (symbol == '.') {
                sb.append("[").append(symbol).append("]");
            } else {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }
}
