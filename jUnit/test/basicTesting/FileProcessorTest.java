package basicTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

// Testing class for FileProcessor
public class FileProcessorTest {
    FileProcessor fileProcessor = new FileProcessor(); // Creating an instance
    String testFilename = "testfile.txt"; // Test file name

    @Test
    public void testWriteAndReadFromFile() throws IOException {
        String testContent = "Hello, this is a test file!";

        // Write to file
        fileProcessor.writeToFile(testFilename, testContent);

        // Read from file and verify content
        assertEquals(testContent, fileProcessor.readFromFile(testFilename));
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFilename, "Sample content");

        // Check if file exists
        File file = new File(testFilename);
        assertTrue(file.exists());
    }

    @Test
    public void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}
