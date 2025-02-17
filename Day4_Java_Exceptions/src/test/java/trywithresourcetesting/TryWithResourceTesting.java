package trywithresourcetesting;

import org.junit.jupiter.api.Test;
import trywithresources.TryWithResources;

public class TryWithResourceTesting {
    // Creating String that hold filePath
    String filePath = "D:\\Capgemini Notes\\DestinationBuffered.txt\\";

    @Test
    public void tryWithResource(){
        // Creating object of the class TryWithResources
        TryWithResources ob = new TryWithResources();

        // Method calling
        ob.readProgramFromFile(filePath);
    }
}
