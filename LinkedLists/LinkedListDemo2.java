package LinkedLists;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        // Create a Java LinkedList of String
        LinkedList<String> flowers = new LinkedList<>();

        // Add elements
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.addFirst("Lotus");       // Adds at the START
        flowers.addLast("Sunflower");    // Adds at the END

        // Get first and last elements
        System.out.println("First Element is: " + flowers.getFirst());
        System.out.println("Last Element is: " + flowers.getLast());

        
        System.out.println("All flowers: " + flowers);

        //remove some specific flowers

         flowers.removeFirst();       // removes 1st
        flowers.removeLast();    // removes last

           for (String flower : flowers) {
            System.out.println(flower);
        }
    }
}

