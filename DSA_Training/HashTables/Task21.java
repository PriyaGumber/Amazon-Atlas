package HashTables;

import java.util.*;


public class Task21 {
    public static void main(String[] args) {
        // 1. Create a regular HashMap
        HashMap<String, Integer> hm1 = new HashMap<>();

        // 2. Wrap it to make it synchronized (thread-safe)
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);

        // Now syncMap is safe for concurrent use (e.g., put/get operations)
    }
}

