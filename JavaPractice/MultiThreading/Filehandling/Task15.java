package MultiThreading.Filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task15 {
    public static void main(String[] args) {
        File f1 = new File("FileName01.txt"); // create a File object
        FileOutputStream outfile = null;

        // Byte array representing "I LOVE INDIA"
        byte[] Text = {'I', ' ', 'L', 'I', 'K', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

    // byte[] Text = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try {
            outfile = new FileOutputStream(f1); // create file and output stream
            outfile.write(Text); // write byte array to file
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null)
                    outfile.close(); // always close the stream
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e);
            }
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
