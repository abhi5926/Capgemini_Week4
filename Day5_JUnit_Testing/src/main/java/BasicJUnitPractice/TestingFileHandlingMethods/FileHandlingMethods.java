package BasicJUnitPractice.TestingFileHandlingMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingMethods {
    // Method to write on file
    public void writeFile(String filePath,String content){
        try{
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            System.out.println("Content Written Successfully :");

        }catch(IOException e){
            System.out.println("Error Occured While Writing On File"+e.getMessage());
        }
    }
    // Method to read data From file
    public String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println("Content read from the file: " + filename);
        }catch (IOException e) {
            System.err.println("An error occurred  " + e.getMessage());
        }
 return content.toString();
    }
    public static void main(String[] args) {
        //Creating Class Object
        FileHandlingMethods ob = new FileHandlingMethods();

        String filePath = "D:\\Capgemini Notes\\DestinationBuffered.txt";
        String content = "Hello Neeraj, This is Sample Content";

        ob.writeFile(filePath,content);

        String fileData = ob.readFromFile(filePath);
        System.out.println(fileData);
    }
}
