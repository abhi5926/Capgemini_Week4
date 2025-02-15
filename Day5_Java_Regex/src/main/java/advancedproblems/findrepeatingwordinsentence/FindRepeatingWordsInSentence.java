package advancedproblems.findrepeatingwordinsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWordsInSentence {
    public static void findRepeatingWords(String str) {
        // Regex to find repeating words
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        // Compile regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // StringBuilder to store matched repeating words
        StringBuilder result = new StringBuilder();

        // Collect all repeating words
        while (matcher.find()) {
            result.append(matcher.group(1)).append(", ");
        }

        // Output the repeating words
        if (result.length() > 0) {
            System.out.println("Repeating Words : " + result.substring(0, result.length() - 2));
        } else {
            System.out.println("No Repeating Words Found");
        }
    }

    public static void main(String[] args) {
        // Creating String
        String str = "This is is a repeated repeated word test.";

        // Method calling
        findRepeatingWords(str);
    }
}
