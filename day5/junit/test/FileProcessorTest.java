package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.FileProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final String testFilename = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Ensure file is deleted before each test
        Files.deleteIfExists(Path.of(testFilename));
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up the test file after each test
        Files.deleteIfExists(Path.of(testFilename));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "JUnit File Testing";
        FileProcessor.writeToFile(testFilename, content);

        // Check if content is correctly written and read
        String readContent = FileProcessor.readFromFile(testFilename);
        assertEquals(content, readContent);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(testFilename, "Test Content");

        // Verify file exists after writing
        assertTrue(Files.exists(Path.of(testFilename)));
    }

    @Test
    void testIOExceptionForMissingFile() {
        // Ensure exception is thrown when reading a non-existent file
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}