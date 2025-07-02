package LinkedLists;

import java.util.LinkedList;

public class Task9 {
    public static void main(String[] args) {
        LinkedList<String> original = new LinkedList<>();
        original.add("B");
        original.add("B");
        original.add("C");

        LinkedList<String> cloned = (LinkedList<String>) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned:   " + cloned);
    }
}
