package BasicJUnitPracticeTesting.StringUtilityMethodTesting;

import BasicJUnitPractice.TestingStringUtilityMethods.StringUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTesting {
    private StringUtility ob;

    @BeforeEach
    void setUp(){
        ob = new StringUtility();
        System.out.println("Before Each Test");
    }
    @Test
    void testReverse(){
       assertEquals("madam",ob.reverseString("madam"));
    }
    @Test
    void testPalindrome(){
        assertEquals(false,ob.isPalindrome("madam"));
    }
    @Test
    void testUpperCase(){
        assertEquals("MADAM",ob.upperCase("madam"));
    }
}
