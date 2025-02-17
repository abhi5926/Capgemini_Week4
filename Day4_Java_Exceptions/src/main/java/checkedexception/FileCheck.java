package checkedexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCheck {
    // Method
    public static void fileCheck(String filePath) {
        try {
            // Creating file object
            File ob = new File(filePath);
            // Creating BufferedReader class Object
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            // condition to check file exist or not
            if (ob.exists()) {
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // file path taking in String
        String filePath = "D:\\Capgemini Notes\\DestinationBuffered.txt";

        // Method calling
        fileCheck(filePath);
    }
}
