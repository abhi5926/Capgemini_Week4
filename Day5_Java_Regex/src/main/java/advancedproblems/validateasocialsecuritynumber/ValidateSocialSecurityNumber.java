package advancedproblems.validateasocialsecuritynumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void validSSN(String str) {
        // Regex to match a valid SSN (format: XXX-XX-XXXX)
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        // Compile regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // Output whether the SSN is valid or not
        if (matcher.matches()) {
            System.out.println(str + " is valid");
        } else {
            System.out.println(str + " is invalid");
        }
    }

    public static void main(String[] args) {
        // Creating String
        String str ="123-45-6789";

        // Calling Method
        validSSN(str);
    }
}
