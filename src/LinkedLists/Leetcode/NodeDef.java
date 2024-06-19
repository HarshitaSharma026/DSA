package LinkedLists.Leetcode;

import java.util.List;

public class NodeDef {

    ListNode head = null;
    static class ListNode {
        int data;
        ListNode next;

        public ListNode() {}
        public ListNode(int data) {
            this.data = data;
        }
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }
    

    public void insertFirst(int data) {
        ListNode newnode = new ListNode(data, null);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void insertLast(int data) {
        if (head == null) {
            insertFirst(data);
            return;
        }
        ListNode newnode = new ListNode(data, null);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
