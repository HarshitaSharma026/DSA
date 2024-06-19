package LinkedLists.Leetcode;

import LinkedLists.SinglyLL;

public class MergeSortedLists {

//    MERGE TWO SORTED LISTS
    public NodeDef.ListNode merge(NodeDef.ListNode head1, NodeDef.ListNode head2) {
        NodeDef.ListNode dummy = new NodeDef.ListNode();
        NodeDef.ListNode tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        tail.next = (head1 != null) ? head1 : head2;
        return dummy.next;
    }
}
