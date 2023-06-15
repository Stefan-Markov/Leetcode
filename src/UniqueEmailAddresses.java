import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        int i = numUniqueEmails(emails);
        System.out.println(i);
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String current : emails) {
            StringBuilder sb = new StringBuilder();
            int indexOfAt = current.indexOf('@');
            String localName = current.substring(0, indexOfAt);
            String domainName = current.substring(indexOfAt);

            for (int j = 0; j < localName.length(); j++) {
                if (localName.charAt(j) == '.') {
                    continue;
                }
                if (localName.charAt(j) == '+') {
                    break;
                }
                sb.append(localName.charAt(j));
            }
            sb.append(domainName);
            set.add(sb.toString());
        }
        return set.size();
    }
}
