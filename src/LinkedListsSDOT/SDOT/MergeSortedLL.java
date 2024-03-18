package LinkedListsSDOT.SDOT;

public class MergeSortedLL {

    // CREATE NODE STRUCTURE
    private Node head = null;
    private int size;

    private Node head1 = null;
    private Node head2 = null;
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // INSERT FOR - SORTED LIST 1
    public void insert1(int data) {
        Node node = new Node(data, null);
        if (head1 == null) {
            head1 = node;
            size++;
        }
        else {
            Node temp = head1;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // INSERT FOR - SORTED LIST 2
    public void insert2(int data) {
        Node node = new Node(data, null);
        if (head2 == null) {
            head2 = node;
            size++;
        }
        else {
            Node temp = head2;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // INSERT - FOR MAIN LIST
    public void insert3(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            size++;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // DISPLAY - FOR LIST 1
    public void display1() {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // DISPLAY - FOR LIST 2
    public void display2() {
        Node temp = head2;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // MERGE THE TWO LISTS - AND MAKE ANOTHER FINAL LIST
    public void merge() {

        // if list 1 is empty
        if (head1 == null) {
            // return the 2nd list
            display2();
        }
        else if (head2 == null) {
            // return 1st list
            display1();
        }
        else {
            Node temp1 = head1;
            Node temp2 = head2;

            while (temp1 != null && temp2 != null) {
                if (temp1.data < temp2.data) {
                    insert3(temp1.data);
                    temp1 = temp1.next;
                }
                else {
                    insert3(temp2.data);
                    temp2 = temp2.next;
                }
            }

            // if list 1 is not empty yet
            while (temp1 != null) {
                insert3(temp1.data);
                temp1 = temp1.next;
            }

            // if list 2 is not empty yet
            while (temp2 != null) {
                insert3(temp2.data);
                temp2 = temp2.next;
            }
        }
    }

    // DISPLAY THE FINAL LIST
    public void display3() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
