package LinkedLists;

public class DoublyLL {

    Node head;
    Node tail;
    int size = 0;
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


//    ---------------- insert at first
    public void insertFirst(int data) {
        Node newnode = new Node(data, null, null);
        // if list is empty
        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size++;
        System.out.println("Insertion at first successfull !!");
    }

//    --------------- insertion last
    public void insertLast(int data) {
        Node newnode = new Node(data, null, null);
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;

        // if no list is there
        if (tail == null) {
            tail = newnode;
            head = newnode;
        }

        size++;
        System.out.println("Insertion at last is successful");
    }

//    /    ------------- insert at mid
    public void insertMid(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
            return;
        }

        if (pos == size) {
            insertLast(data);
        }
        Node temp = head;
        Node curr = head.next;
        for (int i = 1; i < pos - 1; i++) {
            temp = curr;
            curr = curr.next;
        }

        Node newnode = new Node(data, temp.next, curr.prev);
        temp.next = newnode;
        curr.prev = newnode;
        size++;
        System.out.println("Insertion at mid done");
    }

//    --------------- display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END\n");
    }

//    ---------------- display reverse
    public void reverse(){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("START\n");
    }
}
