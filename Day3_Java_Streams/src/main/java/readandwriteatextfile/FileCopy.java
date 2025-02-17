package readandwriteatextfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Files to perform read and write operation
        String sourceFilePath = "D:\\Capgemini Notes\\Sample.txt"; // Fixed the extra quotes
        String destinationFilePath = "D:\\Capgemini Notes\\DestinationFile.txt"; // Fixed the extra quotes

        // Creating FileInputStream and FileOutputStream
        FileOutputStream fOut = null;

        try {
            // Creating File
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist");
                return;
            }

            // Creating FileInputStream
            FileInputStream fInput = new FileInputStream(sourceFile);

            // Creating Destination file
            File destinationFile = new File(destinationFilePath);
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
                System.out.println("Destination file created");
            }

            // Using the already declared fOut
            fOut = new FileOutputStream(destinationFile);

            // Read the content from source file and write on destination file
            int byteData;
            while ((byteData = fInput.read()) != -1) {
                fOut.write(byteData);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            // Handle any I/O exceptions that might occur
            System.out.println("An error occurred: " + e.getMessage());
        }
        }
    }

