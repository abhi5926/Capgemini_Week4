package ExtractionProblemTesting.ExtractAllEmailAddressFromText;

import extractionproblems.extractallemailaddressesfromatext.ExtractAllEmailAddress;
import org.junit.jupiter.api.Test;

public class ExtractAllEmailAddressTesting {
    @Test
    public void extractAllEmailAddress(){
        // Creating SString
        String str ="Contact us at support@example.com and info@company.org";

        // Creating class Object
        ExtractAllEmailAddress ob = new ExtractAllEmailAddress();

        // Calling Method
        ob.extractAllEmailAddress(str);
    }
}
