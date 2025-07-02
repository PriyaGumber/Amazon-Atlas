package MultiThreading.Filehandling;

import java.io.*;
import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        FileOutputStream outfile = null;
        FileInputStream infile = null;
        Scanner sc = new Scanner(System.in);

        
        try {
            // Step 1: Take input from the user
            System.out.print("Enter a line to write into the file: ");
            String s = sc.nextLine();

            // Step 2: Convert string to byte array
            byte[] b1 = s.getBytes();

            // Step 3: Write the byte array to file
            outfile = new FileOutputStream("in.txt"); // this will overwrite if file exists
            outfile.write(b1);
            outfile.close(); // Always close after writing

            System.out.println("Write Byte");
            System.out.println("Thank You...!!!");

            // Step 4: Read back the file content
            infile = new FileInputStream("in.txt");
            int byteData;
            System.out.println("\nContent of the file:");
            while ((byteData = infile.read()) != -1) {
                System.out.print((char) byteData); // convert byte to char and print
            }
            infile.close(); // Always close after reading

        } catch (IOException e) {
            System.out.println("Error: " + e);
            System.exit(-1);
        } finally {
            sc.close();
            try {
                if (outfile != null) outfile.close();
                if (infile != null) infile.close();
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e);
            }
        }
    }
}
