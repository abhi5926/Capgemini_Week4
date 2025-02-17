package convertimagetobytearray;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        // Define file paths for the original and new image
        String inputImagePath = "D:\\Capgemini Notes\\input_image.jpg"; // Original image path
        String outputImagePath = "D:\\Capgemini Notes\\output_image.jpg"; // New image path


        try {
            // Read the image file into a byte array
            byte[] imageBytes = readImageToByteArray(inputImagePath);

            // Write the byte array to a new image file
            writeByteArrayToImage(imageBytes, outputImagePath);

            System.out.println("Image successfully written to " + outputImagePath);

            // Verify if the original and new image are identical
            if (verifyImagesAreIdentical(inputImagePath, outputImagePath)) {
                System.out.println("The new image is identical to the original.");
            } else {
                System.out.println("The new image is different from the original.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to read the image file into a byte array
    public static byte[] readImageToByteArray(String imagePath) throws IOException {
        FileInputStream fis = new FileInputStream(imagePath);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int buffer;
        while ((buffer = fis.read()) != -1) {
            byteArrayOutputStream.write(buffer);
        }
        fis.close();

        return byteArrayOutputStream.toByteArray();
    }

    // Method to write byte array to a new image file
    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputPath);
        fos.write(imageBytes);
        fos.close();
    }

    // Method to verify if two images are identical by comparing their byte arrays
    public static boolean verifyImagesAreIdentical(String image1Path, String image2Path) throws IOException {
        FileInputStream fis1 = new FileInputStream(image1Path);
        FileInputStream fis2 = new FileInputStream(image2Path);

        int byte1, byte2;
        while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
            if (byte1 != byte2) {
                fis1.close();
                fis2.close();
                return false;
            }
        }

        fis1.close();
        fis2.close();

        // If both streams ended at the same time, the images are identical
        return (fis1.read() == -1 && fis2.read() == -1);
    }
}

