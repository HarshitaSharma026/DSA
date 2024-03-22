package LinkedLists.Leetcode;

import LinkedLists.SinglyLL;

public class MergeSortedLists {
    Node head;
    Node tail;

    class Node {
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

    // ----------- INSERT FIRST
    public void insertFirst(int data) {

        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

        if (tail == null) {
            tail = head;
        }
        System.out.println(data + " inserted at first");
    }

    // ------------- INSERT LAST
    public void insertLast(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            insertFirst(data);
        }

        tail.next = newnode;
        newnode.next = null;
    }

    // ---------------- DISPLAY
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
        }
    }
}
