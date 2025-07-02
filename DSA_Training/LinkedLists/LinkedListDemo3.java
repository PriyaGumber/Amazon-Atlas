package LinkedLists;

public class LinkedListDemo3 {

    // STEP 1: Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // STEP 2: Head pointer for the list
    private Node head;

    // STEP 3: METHOD TO ADD A NODE AT THE END
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        // If the list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }  
}

 // STEP 4: METHOD TO DISPLAY THE LIST
    public void display() {
        Node temp = head;

      while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



}
