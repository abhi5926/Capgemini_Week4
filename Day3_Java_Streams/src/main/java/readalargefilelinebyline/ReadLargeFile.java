package readalargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
    public static void main(String[] args) {
        // Path for File
        String filePath = "D:\\Capgemini Notes\\Sample.txt";

        // BufferedReader to read the file line by line
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            // Creating String
            String line;

            while((line = br.readLine()) != null){
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
