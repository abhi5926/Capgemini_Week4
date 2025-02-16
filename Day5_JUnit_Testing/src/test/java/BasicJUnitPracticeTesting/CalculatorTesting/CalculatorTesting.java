package BasicJUnitPracticeTesting.CalculatorTesting;

import BasicJUnitPractice.TestingACalculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTesting {
    private Calculator calculator;

     @BeforeEach
     void setUp() {
         calculator = new Calculator();
         System.out.println("Before each test");
     }
    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }


    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    void testDivision() {
        assertEquals(1, calculator.divide(5, 5));
    }

}
