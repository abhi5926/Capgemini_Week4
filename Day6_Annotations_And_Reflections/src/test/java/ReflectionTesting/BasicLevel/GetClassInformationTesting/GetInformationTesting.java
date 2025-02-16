package ReflectionTesting.BasicLevel.GetClassInformationTesting;

import ReflectionProblems.BasicLevel.GetClassInformation.ClassInformation;
import org.junit.jupiter.api.Test;

public class GetInformationTesting {
    @Test
    public void getInformationTesting(){
        // Creating String
        String name = "java.util.ArrayList";
        // Creating class Object
        ClassInformation ob = new ClassInformation();

        // Method calling
        ob.classInformation(name);
    }
}
