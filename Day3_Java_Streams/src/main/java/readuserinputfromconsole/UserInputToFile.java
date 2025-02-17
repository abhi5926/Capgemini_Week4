package readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {
        // Create BufferedReader to read input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declare FileWriter to write data to file inside try-with-resources
        FileWriter writer = null;

        try {
            // Initialize FileWriter to write to the file
            writer = new FileWriter("D:\\Capgemini Notes\\Sample.txt");

            // Taking name as input from the console
            System.out.println("Enter your name:");
            String name = br.readLine();

            // Taking age as input from the console
            System.out.println("Enter your age:");
            String age = br.readLine();

            // Taking favorite programming language as input from the console
            System.out.println("Enter your favorite programming language:");
            String programmingLanguage = br.readLine();

            // Write user input data to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + programmingLanguage + "\n");

            System.out.println("Your information has been saved to Sample.txt");

        } catch (IOException e) {
            // Handle any I/O exceptions that might occur
            System.out.println("An error occurred: " + e.getMessage());
        }
        }
    }

