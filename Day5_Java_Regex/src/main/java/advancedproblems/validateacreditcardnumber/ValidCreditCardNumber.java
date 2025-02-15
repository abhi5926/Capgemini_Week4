package advancedproblems.validateacreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCreditCardNumber {
    public static void validCreditCard(String str) {
        // Creating Regex
        String regex = "^(4\\d{15}|5\\d{15})$";

        // Compile regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // Check if it matches
        if (matcher.matches()) {
            System.out.println("Valid Credit Card Number : " + str);
        } else {
            System.out.println("Invalid Credit Card Number : " + str);
        }
    }

    public static void main(String[] args) {
        // Creating String
        String str = "5555555555554444";

        // Method calling
        validCreditCard(str);
    }
}
