package AdvancedJUnitPracticeTesting.TestingTempratureConverter;

import AdvancedJUnitPracticeProblems.TestingTempratureConverter.TempratureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TempratureConverterTesting {
    @Test
    public void tempratureConverterTesting(){
        TempratureConverter converter = new TempratureConverter();
        // Test the conversion methods
        double celsius = 25;
        double fahrenheit = 77;
        Assertions.assertEquals(77.0,converter.celsiusToFahrenheit(celsius));
        Assertions.assertEquals(25.0,converter.fahrenheitToCelsius(fahrenheit));
    }
}
