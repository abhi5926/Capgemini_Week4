package BasicJUnitPracticeTesting.fileHandlingTesting;

import BasicJUnitPractice.TestingFileHandlingMethods.FileHandlingMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileHandlingTesting {
    FileHandlingMethods ob;

    @BeforeEach
    public void setUp(){
        ob = new FileHandlingMethods();
    }
    @Test
    public void testWriteAndReadFile() {
        String filename = "D:\\Capgemini Notes\\DestinationBuffered.txt";
        String content = "";


        ob.writeFile(filename, content);

        // Read content from the file
        String fileContent = ob.readFromFile(filename);

        // Assert that the content written and read are the same
        assertEquals(content, ob.readFromFile(filename), "Content read from file doesn't match the content written");}
}
