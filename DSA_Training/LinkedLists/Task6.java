package LinkedLists;
//Remove any element

import java.util.LinkedList;

public class Task6 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Step 1: Add 5 elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Display before removing
        System.out.println("Before: " + list);

        // Step 2: removing 4th element (index 2)
        list.remove(4);

        // Display after removing
        System.out.println("After:  " + list);
    }
}



    
