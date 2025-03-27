import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CheckedExceptionProblem{
    public static void main(String[] args) {
        try{
            // Attempt to open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            // Read and print each line of the file
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        }
        catch(FileNotFoundException e){
            // Handle case where the file does not exist
            System.out.println("File Not Found");
        }
        catch(IOException e){
            // Handle other IO-related errors
            System.out.println("An error occurred while reading the file");
        }
    }
}