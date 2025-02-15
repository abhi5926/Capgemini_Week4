package ExtractionProblemTesting.ExtractDatesTesting;

import extractionproblems.extractdates.DateExtracts;
import org.junit.jupiter.api.Test;

public class ExtractDates {
    @Test
    public void extractDates(){
        // Creating String
        String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020";

        // Creating class Object
        DateExtracts ob = new DateExtracts();

        // Method calling
        // Method calling
        ob.findDates(str);
    }
}
