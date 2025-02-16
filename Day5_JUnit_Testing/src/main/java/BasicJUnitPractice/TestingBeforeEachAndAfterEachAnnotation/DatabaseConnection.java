package BasicJUnitPractice.TestingBeforeEachAndAfterEachAnnotation;

public class DatabaseConnection {
    private boolean isConnected;

    // Method to simulate establishing a database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Method to simulate closing the database connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    // Getter to check if the connection is established
    public boolean isConnected() {
        return isConnected;
    }


    public static void main(String[] args) {
        // Creating class Object
        DatabaseConnection ob = new DatabaseConnection();
        // Method calling
        ob.disconnect();
        ob.isConnected();
        ob.connect();
    }
}
