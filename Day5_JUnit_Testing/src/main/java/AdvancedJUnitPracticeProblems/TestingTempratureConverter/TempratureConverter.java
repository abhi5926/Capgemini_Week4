package AdvancedJUnitPracticeProblems.TestingTempratureConverter;

public class TempratureConverter {
        // Method to convert Celsius to Fahrenheit
        public double celsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }

        // Method to convert Fahrenheit to Celsius
        public double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }

        public static void main(String[] args) {

            TempratureConverter converter = new TempratureConverter();

            // Test the conversion methods
            double celsius = 25;
            double fahrenheit = 77;

            System.out.println(celsius + "°C is " + converter.celsiusToFahrenheit(celsius) + "°F");
            System.out.println(fahrenheit + "°F is " + converter.fahrenheitToCelsius(fahrenheit) + "°C");
        }
    }


