package basicTesting;
import static org.junit.jupiter.api.Assertions.*; // Import assertions to use assertNotNull
import org.junit.jupiter.api.*;

// Test class for DatabaseConnection
public class DatabaseConnectionTest {
    DatabaseConnection db; // Declare the database connection instance

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection(); // Initialize the connection before each test
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect(); // Close connection after each test
    }

    @Test
    public void testConnection() {
        assertNotNull(db); // Ensures the database object is not null
    }
}
