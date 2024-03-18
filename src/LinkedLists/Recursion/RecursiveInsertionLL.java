package LinkedLists.Recursion;

import LinkedLists.SinglyLL;

public class RecursiveInsertionLL {

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

    // ------------------------- RECURSIVE INSERTION - 1
    // this is what we have been given as a method->   make use of helper function
    public void insertRec(int val, int ind) {
        head = insertRec(val, ind, head);
    }

    private Node insertRec(int val, int ind, Node node) {
        // base condition
        if (ind == 0) {
            // make new node, and make it point to current node, then pass this new node to lower function class while returning
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        // if base condition doesn't hit then move forward in the ll
        node.next = insertRec(val, ind -=1, node.next);
        return node;
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
