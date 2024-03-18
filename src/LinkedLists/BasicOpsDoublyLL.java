package LinkedLists;

public class BasicOpsDoublyLL {
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.display();

        ll.insertFirst(400);
        ll.insertFirst(300);
        ll.insertFirst(200);
        ll.insertFirst(100);
        ll.display();
        ll.reverse();
        System.out.println(ll.size);

        ll.insertLast(500);
        ll.display();
        System.out.println(ll.size);

        ll.insertMid(0, 3);
        ll.display();
        System.out.println(ll.size);

//        ll.insertMid(1, 1);
//        ll.display();
//
//        System.out.println("\ndelete first");
//        ll.deleteFirst();
//        ll.display();
//
//        System.out.println("\n delete mid");
//        ll.deleteMid(2);
//        ll.display();
    }
}
