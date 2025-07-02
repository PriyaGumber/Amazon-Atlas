package LinkedLists;

import java.util.LinkedList;

public class Task11 {

    public static void main(String[] args) {
        // 1️⃣ Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2️⃣ Push elements 
        list.push("Apple");
        list.push("Banana");
        list.push("Cherry");


        System.out.println("List after pushes: " + list);

        // 3️⃣ Pop an element 
        String popped = list.pop();
        System.out.println("Popped element: " + popped);

        // Final list:
        System.out.println("List after pop: " + list);
    }
}


