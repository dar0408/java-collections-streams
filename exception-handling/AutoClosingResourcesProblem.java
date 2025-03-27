import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResourcesProblem {
    public static void main(String[] args) {
        // Using try-with-resources to ensure BufferedReader is closed automatically
        try(BufferedReader reader = new BufferedReader(new FileReader("info.txt"))){
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException  e){
            // Handle file reading exceptions
            System.out.println("Error reading file");
        }
    }
}
