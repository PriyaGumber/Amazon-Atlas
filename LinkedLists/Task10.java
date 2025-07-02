package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

//Create  linked list and iterate the values using ListIterator class in util package 


public class Task10 {

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

        // Display using iterator class
        Iterator<String> it = list.iterator();

        System.out.println(" Using Iterator : ");

        while (it.hasNext()) {
        String item = it.next();
        System.out.print(item + " ");
}


}


}

