package LinkedLists;

public class SinglyLL {

    Node head;
    Node tail;
    int size = 0;
    // --------------------------- node class
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

//    ---------------------- INSERT AT FIRST
    public void insertFirst(int data) {

        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

        if (tail == null) {
            tail = head;
        }
        System.out.println(data + " inserted at first");
        size++;
    }

//    ------------- insert at mid
    public void insertMid(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
            return;
        }

        if (pos == size) {
            // insert last
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        Node newnode = new Node(data, temp.next);
        temp.next = newnode;
        size++;
    }

//    -------------- delete from first
    public void deleteFirst() {
        int value = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("deleted from first: " + value);
    }

//    ---------------- delete last
    public void deleteLast() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int value = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        System.out.println("deleted from last: " + value);
    }

    // ---------------- delete at mid
    public void deleteMid(int pos) {
        //delete from first
        if (pos == 1) {
            deleteFirst();
        }

        if (pos == size) {
            deleteLast();
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

//    ------------------- display
    public void display(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
