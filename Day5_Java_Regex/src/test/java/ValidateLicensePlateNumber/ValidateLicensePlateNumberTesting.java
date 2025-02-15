package BasicRegexProblemTesting.ValidateLicensePlateNumber;

import basicregexproblems.validatealicenseplatenumber.ValidLicensePlateNumber;
import org.junit.jupiter.api.Test;

public class ValidateLicensePlateNumberTesting {
    @Test
    public void validateLicenseplateNumber(){
        // Creating String
        String str = "AB1234";
        // Creating class object

        ValidLicensePlateNumber ob = new ValidLicensePlateNumber();
        // Method calling
        ob.validLicensePlateNumber(str);
    }
}
