package extractionproblems.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtracts {
    public static void findDates(String text){
        // Creating Regex
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";


        // Copiling regex using pattern class Compile Method
        Pattern pattern = Pattern.compile(regex);

        // Creating Matcher Object
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        // Creating String to Store text
        String text ="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Method calling
        findDates(text);

    }
}
