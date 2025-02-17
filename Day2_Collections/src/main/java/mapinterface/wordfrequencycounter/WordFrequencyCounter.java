package mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
        public static void main(String[] args) {
            String fileName = "Sample.txt"; // Replace with your file name
            Map<String, Integer> wordCount = new HashMap<>();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Remove punctuation and convert to lowercase
                    line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                    String[] words = line.split("\\s+");

                    // Count the frequency of each word
                    for (String word : words) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Print the word frequencies
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }


