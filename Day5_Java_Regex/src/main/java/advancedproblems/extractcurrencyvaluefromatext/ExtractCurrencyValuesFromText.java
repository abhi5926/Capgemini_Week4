package advancedproblems.extractcurrencyvaluefromatext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValuesFromText {
    public static void extractCurrencies(String str) {
        // Regex to match currency values
        String regex = "\\$?\\d+(\\.\\d{2})?";

        // Compile regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // StringBuilder to store matched currency values
        StringBuilder result = new StringBuilder();

        // Collect all matching currency values
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }

        // Output the currency values
        if (result.length() > 0) {
            System.out.println("Currency Values : " + result.substring(0, result.length() - 2));
        } else {
            System.out.println("No Currency Values Found");
        }
    }

    public static void main(String[] args) {
        // Creating String
        String str ="The price is $45.99, and the discount is 10.50.";

        // Method calling
        extractCurrencies(str);
    }
}
