package interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream inputStream;


    // Constructor
    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }


    @Override
    public void run() {
        try {
            // Reading data from the piped input stream
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String data = new String(buffer, 0, bytesRead);
            System.out.println("Reader thread: Data received from the pipe: " + data);
        } catch (IOException e) {
            System.out.println("Reader thread: Error reading from pipe: " + e.getMessage());
        }
    }
}
