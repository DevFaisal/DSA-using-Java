package LinkedList;

public class LinkedList {

    // Linked list Decelration
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add nodes at the First
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public static void addMiddle(int data) {

        if (head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
        System.out.println("middle ->" + slow.data);
    }

    // add node at the last of the linkedlist
    public static void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print the Linked List
    public static void printLL() {

        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        addFirst(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);

        printLL();

    }

}
