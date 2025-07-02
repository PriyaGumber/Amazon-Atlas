package MultiThreading.Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task25 {

    public static void main(String[] args) {
        // File to write to
        String filePath = "example.txt";

        // Content to write
        String content = "Hello, World!\nThis is a BufferedWriter example.";

        // BufferedWriter writes text efficiently to files
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content); // Writing the string to the file
            System.out.println("Content written to file.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

    
