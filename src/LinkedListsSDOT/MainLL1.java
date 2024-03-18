package LinkedListsSDOT;

public class MainLL1 {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.deleteLast();
        list.insertFirst(89);
        list.insertFirst(45);
        list.insertFirst(7);
        list.insertLast(3);
        list.insertLast(10);
        list.insertIndex(100, 3);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteIndex(3);
        list.display();

    }
}
