package MultiThreading.Filehandling;
 import java.io.*;

public class Task19 {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("FileName03.txt"); // file must exist
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // convert and print each character
            }
            System.out.println("\nReading complete");
            fr.close(); // close the file reader
        } 
        catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

    
