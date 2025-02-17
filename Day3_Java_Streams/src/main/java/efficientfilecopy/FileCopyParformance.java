package efficientfilecopy;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileCopyParformance {
        public static void main(String[] args) {
            String sourceFilePath = "D:\\Capgemini Notes\\LargeFile.txt"; // Example 100MB file
            String destinationBufferedPath = "D:\\Capgemini Notes\\DestinationBuffered.txt";
            String destinationUnbufferedPath = "D:\\Capgemini Notes\\DestinationUnbuffered.txt";

            try {
                // Measure time for Buffered Stream copy
                long startTimeBuffered = System.nanoTime();
                copyFileBuffered(sourceFilePath, destinationBufferedPath);
                long endTimeBuffered = System.nanoTime();
                long durationBuffered = endTimeBuffered - startTimeBuffered;
                System.out.println("Buffered stream copy time: " + durationBuffered / 1_000_000.0 + " milliseconds");

                // Measure time for Unbuffered Stream copy
                long startTimeUnbuffered = System.nanoTime();
                copyFileUnbuffered(sourceFilePath, destinationUnbufferedPath);
                long endTimeUnbuffered = System.nanoTime();
                long durationUnbuffered = endTimeUnbuffered - startTimeUnbuffered;
                System.out.println("Unbuffered stream copy time: " + durationUnbuffered / 1_000_000.0 + " milliseconds");

            } catch (IOException e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }

        // Copy using Buffered Streams
        public static void copyFileBuffered(String sourceFilePath, String destinationFilePath) throws IOException {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFilePath))) {

                byte[] buffer = new byte[4096];  // 4 KB buffer
                int bytesRead;

                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
            }
        }

        // Copy using Unbuffered Streams
        public static void copyFileUnbuffered(String sourceFilePath, String destinationFilePath) throws IOException {
            try (FileInputStream fis = new FileInputStream(sourceFilePath);
                 FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
        }
    }


