package LinkedLists;

import java.util.LinkedList;

public class Task7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Step 1 & 2: Add 5 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Mango");

        // Display using for loop with get()

        System.out.print("Using for-loop with get(): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Display using enhanced for-each loop
        System.out.print("Using for-each loop: ");
        for (String fruit : list) {
            System.out.print(fruit);
            System.out.print(", ");
        }
        System.out.println();

       String[] arr = list.toArray(new String[list.size()]);
       for (String ele : arr) {
       System.out.println(ele);

}

    }

}


    
