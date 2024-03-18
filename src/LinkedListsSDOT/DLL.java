package LinkedListsSDOT;

public class DLL {

    // CREATE NODE CLASS
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data ;
            this.next = next;
            this.previous = prev;
        }
    }

    // INSERT AT FIRST --------------------------
    public void insertFirst(int data) {
        Node node = new Node(data);

        // if the list is empty
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;

    }

    // INSERT LAST ---------------------------
    public void insertLast(int data) {
        // if list is empty
        if (head == null) {
            insertFirst(data);
        }
        else {
            Node node = new Node(data);
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // INSERT AT INDEX ---------------------------
    public void insertIndex(int data, int index) {
        Node node = new Node(data);

        if (head == null || index == 1) {
            // we are trying to add at first node
            insertFirst(data);
        }
        if (index == size) {
            // we are trying to add node at last index
            insertLast(data);
        }
        else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.previous = node;
            temp.next = node;
            node.previous = temp;
            size++;
        }

    }

    // DELETE AT FIRST ---------------------------

    // DELETE FROM LAST -------------------------- (DO IT WITHOUT TAIL)

    // DISPLAY -----------------------------------
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.println("Printing in forward: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" null ");
        System.out.println("size: " + size);

        Node prev = tail;
        System.out.println("\nPrinting in reverse: ");
        while (prev != null) {
            System.out.print(prev.data + " -> ");
            prev = prev.previous;
        }
        System.out.print(" null ");
        System.out.println("size: " + size);
    }
}
