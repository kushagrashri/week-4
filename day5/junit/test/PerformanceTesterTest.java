package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fail if it takes more than 2 sec
    void testLongRunningTask() {
        assertEquals("Task Completed", PerformanceTester.longRunningTask());
    }
}