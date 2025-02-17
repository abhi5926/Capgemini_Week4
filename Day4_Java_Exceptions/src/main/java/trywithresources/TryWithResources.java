package trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    // Creating Method
    public static void readProgramFromFile(String filePath){
        // Handling Exception using try and catch block
        try {
            // Creating file object
            FileReader ob = new FileReader(filePath);
            BufferedReader br = new BufferedReader(ob);
            String line;
            line = br.readLine();
            System.out.println(line);
        } catch(IOException e){
            System.out.println("Error reading File :"+e.getMessage());
        }

    }
    public static void main(String[] args) {
        // Creating String that hold filePath
        String filePath = "D:\\Capgemini Notes\\DestinationBuffered.txt\\";

        // Method Calling
        readProgramFromFile(filePath);
    }
}
