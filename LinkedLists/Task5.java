package LinkedLists;
//Wap to create linked list add 5 elements to it and replace 3 rd element with different value..

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Step 1: Add 5 elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Display before replacement
        System.out.println("Before: " + list);

        // Step 2: Replace 3rd element (index 2)
        list.set(2, "NewValue");

        // Display after replacement
        System.out.println("After:  " + list);
    }
}


