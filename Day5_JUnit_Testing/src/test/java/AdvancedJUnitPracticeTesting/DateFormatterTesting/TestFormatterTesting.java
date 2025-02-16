package AdvancedJUnitPracticeTesting.DateFormatterTesting;

import AdvancedJUnitPracticeProblems.TestingDateFormatter.DateFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFormatterTesting {
    //Creating Ckass Object
    DateFormatter dateFormatter = new DateFormatter();
    @Test
    public void testFormatTesting(){
        String inputDate = "2025-02-16";

        Assertions.assertEquals("16-02-2025",dateFormatter.formatDate(inputDate));
    }
}
