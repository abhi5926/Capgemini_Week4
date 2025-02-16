package BasicJUnitPracticeTesting.TestingParameterizedTests;

import BasicJUnitPractice.TestingParameterized.TestingParameterized;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTesting {
    // creating class Object
    TestingParameterized ob = new TestingParameterized();

    @Test
    public void isEvenCheck(){
        assertTrue(ob.isEven(6));
    }

    }


