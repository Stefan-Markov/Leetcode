public class DefangingAnIpAddress {
    public static void main(String[] args) {
        var address = "1.1.1.1";
        String s = defangIPaddr(address);
        System.out.println(s);
    }

    /**
     * 1108. Defanging an IP Address
     */
    public static String defangIPaddr(String address) {
        // step 1: create StringBuilder
        StringBuilder sb = new StringBuilder();
        // step 2: iterate over the address
        for (int i = 0; i < address.length(); i++) {
            // step 3: get char at given index
            char symbol = address.charAt(i);
            // step 4: check for .
            if (symbol == '.') {
                sb.append("[").append(symbol).append("]");
            } else {
                // step 5: append the symbol
                sb.append(symbol);
            }
        }
        // step 6: return the result
        return sb.toString();
    }
}
