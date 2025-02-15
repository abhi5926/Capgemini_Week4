package BasicRegexProblemTesting.ValidateHexColorCode;

import basicregexproblems.validateahexcolorcode.ValidHexColor;
import org.junit.jupiter.api.Test;

public class ValidateHexColorTesting {
    @Test
    public void validateHexColor(){
        // Creating String
        String str = "#ff4500";

        // Creating Class Object
        ValidHexColor ob = new ValidHexColor();

        // Method calling
        ob.validHexcolor(str);
    }
}
