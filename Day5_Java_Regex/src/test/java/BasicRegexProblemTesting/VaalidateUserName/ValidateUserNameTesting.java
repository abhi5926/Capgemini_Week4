package BasicRegexProblemTesting.VaalidateUserName;

import basicregexproblems.validateausername.ValidateUsername;
import org.junit.jupiter.api.Test;

public class ValidateUserNameTesting {
 @Test
    public void validateUserName(){
     String str = "Abhishek_123";
     // Creating class Object
     ValidateUsername ob = new ValidateUsername();

     // Method calling
     ob.validUsername(str);

 }

}
