package HashTables;

import java.io.*;
import java.util.*;

class Task017 {
    public static void main(String args[]) {
        // Now BOTH key and value are String
        HashMap<String, String> hmobj1 = new HashMap<>();
        HashMap<String, String> hmobj2 = new HashMap<>();

        // Put some sample data
        hmobj1.put("10", "Anitha");
        hmobj1.put("20", "Saritha");
        hmobj1.put("30", "Ankitha");

        hmobj2.put("44", "John");
        hmobj2.put("55", "Steve");
        hmobj2.put("66", "Jack");

        // Printing the hash maps
        System.out.println("Mapping HashMap hmobj1: " + hmobj1);
        System.out.println("Mapping HashMap hmobj2: " + hmobj2);
    }
}

    

