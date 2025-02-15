package advancedproblems.extractprogramminglanguagenamesfromatext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNamesFromText {
    public static void extractLanguages(String str) {
        // Regex to match common programming languages
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        // Compile regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the string with the regex pattern
        Matcher matcher = pattern.matcher(str);

        // StringBuilder to store matched languages
        StringBuilder result = new StringBuilder();

        // Collect all matching programming languages
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }

        // Output the programming languages
        if (result.length() > 0) {
            System.out.println("Programming Languages : " + result.substring(0, result.length() - 2));
        } else {
            System.out.println("No Programming Languages Found");
        }
    }

    public static void main(String[] args) {
        // Creating String
        String str = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extractLanguages(str);
    }
}
