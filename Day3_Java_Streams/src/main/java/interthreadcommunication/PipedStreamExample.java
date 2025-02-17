package interthreadcommunication;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    // Constructor
    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        String data = "Hello from the writer thread!";
        try {
            // Writing data to the piped output stream
            outputStream.write(data.getBytes());
            System.out.println("Writer thread: Data written to the pipe.");
        } catch (IOException e) {
            System.out.println("Writer thread: Error writing to pipe: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        // Creating a piped output stream and a piped input stream
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            // Connecting the PipedInputStream to the PipedOutputStream
            pipedInputStream.connect(pipedOutputStream);

            // Creating and starting the threads
            Thread writerThread = new WriterThread(pipedOutputStream);
            Thread readerThread = new ReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error in communication: " + e.getMessage());
        }
    }
}

