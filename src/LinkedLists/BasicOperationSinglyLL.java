package LinkedLists;

public class BasicOperationSinglyLL {
    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.display();

        ll.insertFirst(100);
        ll.insertFirst(200);
        ll.insertFirst(300);
        ll.insertFirst(400);
        ll.display();
        System.out.println(ll.size);

        ll.insertMid(1, 1);
        ll.display();

        System.out.println("\ndelete first");
        ll.deleteFirst();
        ll.display();

        System.out.println("\n delete mid");
        ll.deleteMid(2);
        ll.display();


    }
}
