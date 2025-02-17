package countwordsinfile;

import java.io.*;
import java.util.*;

public class CountWordsInFile {
    public static void main(String[] args) {
        // String that stores the file path
        String filePath = "D:\\Capgemini Notes\\sample.txt";

        // HashMap to store word count
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Use try-with-resources to automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using non-word characters as delimiter
                String[] words = line.split("\\W+");

                // Count each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();  // Convert word to lowercase to count in a case-insensitive way
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Sort the words by frequency in descending order
        List<Map.Entry<String, Integer>> sortedWordList = new ArrayList<>(wordCountMap.entrySet());
        sortedWordList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Display the top 5 most frequent words
        System.out.println("Top 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWordList) {
            if (count < 5) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            } else {
                break;
            }
        }
    }
}
