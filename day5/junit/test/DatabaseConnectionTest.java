package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.DatabaseConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected before the test");
    }

    @Test
    public void testConnectionClosedAfterTest() {
        dbConnection.disconnect(); // Explicitly disconnect to test behavior
        assertFalse(dbConnection.isConnected(), "Database should be disconnected after the test");
    }
}