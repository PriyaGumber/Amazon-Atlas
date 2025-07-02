package MultiThreading.Filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Task24 {

    public static void main(String[] args) {
        FileReader reader = null;

        try {
            // Open the file for reading
            reader = new FileReader("in.txt");

            int character;

            // Read one character at a time until end of file
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            System.out.println("\nFile reading completed.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            // Ensure the file is closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the file.");
                e.printStackTrace();
            }
        }
    }
}


