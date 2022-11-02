import java.util.HashSet;

public class _929 {

    public static int numUniqueEmails(String[] emails) {
        HashSet hs = new HashSet<>();
        for (String st : emails) {
            String arr[] = st.split("@");
            StringBuilder st2 = new StringBuilder();
            for (int i = 0; i < arr[0].length(); i++) {
                if (arr[0].charAt(i) == '+')
                    break;
                if (arr[0].charAt(i) == '.')
                    continue;
                st2.append(arr[0].charAt(i));
            }
            hs.add(st2.toString() + '@' + arr[1]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));

    }

}
