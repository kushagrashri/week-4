package src.main.java.org.week4.day5.junit.main;

public class DatabaseConnection {
    private boolean isConnected = false;

    // Method to simulate connecting to a database
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Method to simulate disconnecting from a database
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if the connection is active
    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        dbConnection.connect();
        System.out.println("Is database connected? " + dbConnection.isConnected());

        dbConnection.disconnect();
        System.out.println("Is database connected? " + dbConnection.isConnected());
    }
}