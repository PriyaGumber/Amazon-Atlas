package LinkedLists;

import java.util.NoSuchElementException;

public class Task3 {

    // STEP 1: Node class
    static class Node<T> {
        T data; //data
        Node<T> next; //link to next node

        public Node(T data) { //constructor to initiate the variables
            this.data = data;
            this.next = null;
        }
    }

    // STEP 2: Custom Linked List
    static class CustomLinkedList<T> {
        private Node<T> head;
        private int size = 0;

        // Adding data to the end
        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) { // If list is empty, new node becomes the head
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next; //move to last node
                }
                current.next = newNode; //link new to end
            }
            size++;
        }

        // Adding data at the beginning
        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // Add at a specific position
        public void addAt(int index, T data) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            if (index == 0) {
                addFirst(data);
                return;
            }

            Node<T> newNode = new Node<>(data);
            Node<T> current = head;

            // Traverse to the node just BEFORE the desired position
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            // Insert newNode
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }

        // Remove from the beginning
        public T removeFirst() {
            if (head == null) {
                throw new NoSuchElementException("List is empty");
            }
            T removedData = head.data;
            head = head.next;
            size--;
            return removedData;
        }

        // Remove from the end
        public T removeLast() {
            if (head == null) {
                throw new NoSuchElementException("List is empty");
            }
            if (head.next == null) {
                T removedData = head.data;
                head = null;
                size--;
                return removedData;
            }

            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            T removedData = current.next.data;
            current.next = null;
            size--;
            return removedData;
        }

        // Get the size of the list
        public int size() {
            return size;
        }

        // Display the list
        public void display() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Bounds checking method
        private void checkBounds(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        CustomLinkedList<String> flowerList = new CustomLinkedList<>();

        //adding flowers and displaying

        flowerList.addFirst("Rose");
        flowerList.addFirst("Lily");
        flowerList.display();

        flowerList.addLast("Lotus");
        flowerList.addLast("Marigold");
        flowerList.display();

        // removing flowers
        System.out.println("Removed First: " + flowerList.removeFirst());
        flowerList.display();

        System.out.println("Removed Last: " + flowerList.removeLast());
        flowerList.display();

        // Final size
        System.out.println("Final size of the list: " + flowerList.size());

    }

}
