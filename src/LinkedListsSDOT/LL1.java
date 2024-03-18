package LinkedListsSDOT;


public class LL1 {

    // LL structure
    private Node head;
    private Node tail;
    private int size;
    public LL1() {
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
        }
    }

    // INSERT AT FIRST ------------------------------
    public void insertFirst(int value) {
        Node node = new Node(value);

        // if the list is empty
        if (head == null) {
            head = node;
            tail = node;
            size++;
        }
        else {
            node.next = head;
            head = node;
            size++;
        }
    }

    // INSERT LAST --------------------------------
    public void insertLast(int value) {
        Node node = new Node(value);

        // if list is empty
        if (head == null) {
            insertFirst(value);
            return;
        }
        else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // INSERT AT INDEX -----------------------------
    public void insertIndex(int value, int index) {
        if (index == 0) {
            // element is inserted at first
            insertFirst(value);
            return;
        }

        if (index == size) {
            // if we are tring the add the new node at last index
            insertLast(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // DELETE FIRST --------------------------------
    public void deleteFirst() {
        // if list is empty
        if (head == null) {
            System.out.println("list is already empty");
            return;
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Deleted first element: " + val);
    }

    // DELETE LAST ---------------------------------
    public void deleteLast() {
        // if only 1 element in the list or if list is empty
        if (size == 1 || head == null) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        System.out.println("deleted last value: " + val);
    }

    // DELETE FROM INDEX
    public void deleteIndex(int index) {
        if (index == 0) {
            // we want to delete the first element
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            // we want to delete the last element
            deleteLast();
            return;
        }
        Node prev = head;
        Node cur = head.next;
        for (int i = 0; i < index - 1; i++) {
            prev = cur;
            cur = cur.next;
        }
        int val = cur.value;
        prev.next = cur.next;
        size--;
        System.out.println("deleted at index: " + val);
    }

    // DISPLAY -------------------------------------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("\nsize: " + size);
    }
}
