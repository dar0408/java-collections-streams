package streams.readlargefile;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
    	String filePath = "large_log.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("mohan")) { // Case-insensitive check
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
