package queueinterface.generatebinarynumbersusingaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static void generateBinaryNumber(int n){
        Queue<String> queue = new LinkedList<>();

        // add First Binary Number in queue
        queue.add("1");

        // running loop to generate N binary numbers
        for(int i=0;i<n;i++){
            String binary = queue.poll();

            // Display binary Number
            System.out.println(binary +" ");

            // generate new binary number
            queue.add(binary + "0");
            queue.add(binary + "1");

        }
    }
    public static void main(String[] args) {
        int n = 5;
         // Method call to generate Binary Number
        generateBinaryNumber(n);
    }
}
