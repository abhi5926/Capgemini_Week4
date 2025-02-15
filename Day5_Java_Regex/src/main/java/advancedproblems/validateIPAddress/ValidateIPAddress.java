package advancedproblems.validateIPAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void validIPv4(String str) {
        // Regex to match
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Compile regex  pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // Check if it matches
        if (matcher.matches()) {
            System.out.println("Valid IPv4 Address : " + str);
        } else {
            System.out.println("Invalid IPv4 Address : " + str);
        }
        }

    public static void main(String[] args) {
        // Creating String
        String  str = "192.168.123.132";

        // Method calling
        validIPv4(str);

    }
}
