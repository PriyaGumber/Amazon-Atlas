package LinkedLists;

import java.util.LinkedList;
import java.util.Spliterator;

public class Task14 {


    public static void main(String[] args) {
        // 1️⃣ Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // 2️⃣ Get the first spliterator
        Spliterator<String> itobj1 = list.spliterator();

        // 3️⃣ Split it into two
        Spliterator<String> itobj2 = itobj1.trySplit();

        // 4️⃣ Print the first part (itobj2) using forEachRemaining
        System.out.println("First Part:");
        itobj2.forEachRemaining(System.out::println);

        // 5️⃣ Print the second part (itobj1) using tryAdvance
        System.out.println("\nSecond Part:");
        while (itobj1.tryAdvance((n) -> {
            System.out.println(n);
        })) {
            // Keep looping until no more elements
        }
    }
}

    
