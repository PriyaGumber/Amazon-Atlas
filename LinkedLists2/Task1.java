public class Task1{
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head; // first node
    private Node tail; // last node 

    // add: append data at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // traverse: print all nodes
    public void traverse() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.traverse();  // ➞ 5 10 15
    }
}
