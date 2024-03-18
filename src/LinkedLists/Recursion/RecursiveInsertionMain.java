package LinkedLists.Recursion;

public class RecursiveInsertionMain {
    public static void main(String[] args) {
        RecursiveInsertionLL ll = new RecursiveInsertionLL();
        ll.insertFirst(100);
        ll.insertFirst(200);
        ll.insertFirst(300);
        ll.insertFirst(400);
        ll.display();

        System.out.println("after recursive iteration: ");

        ll.insertRec(88, 2);
        ll.display();
    }
}
