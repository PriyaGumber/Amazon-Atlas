package LinkedLists;

public class Task18 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();  // Now valid
        dll.addAtHead(30);
        dll.addAtHead(20);
        dll.addAtHead(10);
        System.out.print("List (head - > tail): ");
        dll.printForward();  // Outputs: 10 20 30
    }

    // Declare it static to allow direct instantiation
    public static class DoublyLinkedList {
        private static class Node {
            int data;
            Node prev, next;
            public Node(int data) { this.data = data; }
        }

        private Node head, tail;

        public void addAtHead(int data) {
            Node newNode = new Node(data);
            if (head == null) head = tail = newNode;
            else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void printForward() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
