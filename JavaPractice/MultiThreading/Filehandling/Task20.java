package MultiThreading.Filehandling;

  import java.io.*;

      //  CopyByte 

public class Task20 {
    public static void main(String[] args) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        try {
            // Open input and output files
            infile = new FileInputStream("FileName01.txt");
            outfile = new FileOutputStream("NewFile06.txt");

            int byteRead;
            // Read and write byte-by-byte until end of file
            while ((byteRead = infile.read()) != -1) {
                outfile.write(byteRead);
            }

            System.out.println("Byte copied from FieName01.txt to NewFile06.txt file.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            // Close files in finally block to ensure they close even if error occurs
            try {
                if (infile != null) infile.close();
                if (outfile != null) outfile.close();
            } catch (IOException e) {
                System.out.println("Error while closing files: " + e.getMessage());
            }
        }
    }
}
