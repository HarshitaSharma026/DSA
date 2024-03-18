package LinkedLists;

public class CircularLL {
    Node head;
    int size = 0;
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

//    ----------------- insert at first
    public void insertFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            head.next = head;
        }
        newnode.next = head;
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        head = newnode;
        size++;
        System.out.println("insert at first done !!");
    }

//    ------------- display
    public void display() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }
}
