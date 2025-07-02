package MultiThreading.Filehandling;

import java.io.*;

public class Task22 {

    public static void main(String args[]) {
        // Check if two command line arguments are passed
        if (args.length != 2) {
            System.out.println("Usage: java FileRenameDemo <oldfilename> <newfilename>");
            return;
        }

        // Create File objects
        File f1 = new File(args[0]); // old file name
        File f2 = new File(args[1]); // new file name

        // Attempt to rename
        if (f1.renameTo(f2)) {
            System.out.println("File renamed from " + f1.getName() + " to " + f2.getName() + " successfully.");
        } else {
            System.out.println("Failed to rename file. Make sure the source file exists.");
        }
    }
}


