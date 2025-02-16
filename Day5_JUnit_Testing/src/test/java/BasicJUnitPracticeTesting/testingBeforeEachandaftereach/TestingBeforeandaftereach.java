package BasicJUnitPracticeTesting.testingBeforeEachandaftereach;
import BasicJUnitPractice.TestingBeforeEachAndAfterEachAnnotation.DatabaseConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestingBeforeandaftereach {


        private DatabaseConnection databaseConnection;

        // This method will run before each test
        @BeforeEach
        public void setUp() {
            databaseConnection = new DatabaseConnection();
            databaseConnection.connect();
        }

        // This method will run after each test
        @AfterEach
        public void tearDown() {
            databaseConnection.disconnect();
        }

        // Test to verify the connection is established
        @Test
        public void testConnectionEstablished() {
            assertTrue(databaseConnection.isConnected(), "The database connection should be established.");
        }

        // Test to verify the connection is closed after each test
        @Test
        public void testConnectionClosed() {
            assertTrue(databaseConnection.isConnected(), "The database connection should be established before disconnect.");
            databaseConnection.disconnect();
            assertFalse(databaseConnection.isConnected(), "The database connection should be closed.");
        }
    }


