package checkedexceptiontesting;

import checkedexception.FileCheck;
import org.junit.jupiter.api.Test;

public class CheckedExceptionTesting {
    @Test
 public void checkedExceptionTesting(){
        // Creating String that Contain file path
        String filePath = "D:\\Capgemini Notes\\DestinationBuffered.txt";
        FileCheck.fileCheck(filePath);
    }
}
