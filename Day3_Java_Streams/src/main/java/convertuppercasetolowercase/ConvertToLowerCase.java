package convertuppercasetolowercase;

import java.io.*;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        // Paths for input and output files
        String inputFilePath = "D:\\Capgemini Notes\\Sample.txt";
        String outputFilePath = "D:\\Capgemini Notes\\DestinationFile.txt";

        // Using BufferedReader to read input file and BufferedWriter to write to output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {

                String lowerCaseLine = line.toLowerCase();

                writer.write(lowerCaseLine);
                writer.newLine();
            }

            System.out.println("File conversion to lowercase completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}

