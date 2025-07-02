package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Task19 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "first");
        System.out.println(map.get(null));  // prints "first"
        map.put(null, "second");
        System.out.println(map.get(null));  // prints "second"

         map.put("A", null);
        System.out.println(map.get("A"));  

         map.put("B", null);
        System.out.println(map.get("B"));  

        System.out.println(map.size());     // prints 1 as only second exists and overwrites 1
    }
}
