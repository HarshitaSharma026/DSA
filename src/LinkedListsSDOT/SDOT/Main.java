package LinkedListsSDOT.SDOT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // MERGE SORTED LL
//        MergeSortedLL list = new MergeSortedLL();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("enter elements: ");
//            list.insert1(sc.nextInt());
//        }
//
//        System.out.println("Enter m: ");
//        int m = sc.nextInt();
//        for (int i = 0; i < m; i++) {
//            System.out.println("enter elements: ");
//            list.insert2(sc.nextInt());
//        }
//
//        list.merge();
//        list.display3();

        // EVEN ODD LIST MERGE
        EvenOddMerge list = new EvenOddMerge();
        Scanner sc = new Scanner(System.in);
//
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements: ");
            int elem = sc.nextInt();
            if (elem % 2 == 0) {
                list.insert1(elem);
            }
            else {
                list.insert2(elem);
            }
        }
//        list.display1();
//        list.display2();

        list.evenOdd();
        list.display3();
    }
}
