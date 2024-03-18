package LinkedListsSDOT;

public class MainDLL {
    public static void main(String[] args) {
        DLL doubly = new DLL();
        doubly.insertFirst(89);
        doubly.insertFirst(100);
        doubly.insertFirst(34);
        doubly.display();

        doubly.insertIndex(1000, 2);
        doubly.display();
    }
}
