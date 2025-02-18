package src.main.java.org.week4.day5.junit.main;

public class PerformanceTester {

    // Method that simulates a long-running task by sleeping for 3 seconds
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        System.out.println(longRunningTask());
    }
}