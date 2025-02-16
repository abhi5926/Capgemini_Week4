package AdvancedJUnitPracticeProblems.TestingDateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatter {
        // Method to format
        public String formatDate(String inputDate) {
            // Define the input and output date formats
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                // Parse the input date into a Date object
                Date date = inputFormat.parse(inputDate);

                // Format the Date object to the desired output format
                return outputFormat.format(date);
            } catch (ParseException e) {
                // Handle invalid date format
                return "Invalid date format";
            }
        }

        public static void main(String[] args) {
            DateFormatter dateFormatter = new DateFormatter();

            // Test the formatDate method
            String inputDate = "2025-02-16";
            System.out.println("Formatted date: " + dateFormatter.formatDate(inputDate));
        }
    }


