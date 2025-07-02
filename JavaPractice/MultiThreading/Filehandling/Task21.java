package MultiThreading.Filehandling;

import java.io.*;

//File Merge

public class Task21 {


    public static void main(String[] args) {
        // Name of the output (merged) file
        String mergedFile = "MergedFile.txt";

        try (
            // Input streams for both source files
            FileInputStream file1 = new FileInputStream("NewFile05.txt");
            FileInputStream file2 = new FileInputStream("in.txt");

            // Merge both input streams
            SequenceInputStream sequenceStream = new SequenceInputStream(file1, file2);

            // Buffered input stream for efficient reading
            BufferedInputStream bufferedIn = new BufferedInputStream(sequenceStream);

            // Buffered output stream to the new merged file
            BufferedOutputStream bufferedOut = new BufferedOutputStream(new FileOutputStream(mergedFile))
        ) {
            int byteData;

            // Read from the combined input stream and write to the output file
            while ((byteData = bufferedIn.read()) != -1) {
                bufferedOut.write(byteData);
            }

            // Flush data to ensure it's written to disk
            bufferedOut.flush();

            System.out.println(" Merged content written to: " + mergedFile);
        } catch (IOException e) {
            System.out.println(" Error during file merging: " + e.getMessage());
        }
    }
}
