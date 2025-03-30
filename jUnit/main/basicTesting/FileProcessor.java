package basicTesting;

import java.io.*;

// Class for file operations like writing and reading
public class FileProcessor {

    // Writes content to a file
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content); // Writing content to the file
        }
    }

    // Reads content from a file
    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n"); // Reading each line and appending
            }
        }
        return content.toString().trim(); // Removing extra new line at the end
    }
}

