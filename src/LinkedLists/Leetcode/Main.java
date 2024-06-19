package LinkedLists.Leetcode;

public class Main {
    public static void main(String[] args) {
        NodeDef first = new NodeDef();
        NodeDef second = new NodeDef();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);
        second.insertLast(6);
        System.out.println("First list: ");
        first.display(first.head);
        System.out.println("\nSecond list: ");
        second.display(second.head);

        MergeSortedLists ans = new MergeSortedLists();
        NodeDef.ListNode head = ans.merge(first.head, second.head);

        NodeDef a = new NodeDef();
        a.display(head);
    }
}
