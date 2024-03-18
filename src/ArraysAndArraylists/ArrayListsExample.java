package ArraysAndArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(67);
//        list.add(100);
//        list.add(68);
//        list.add(90);
//        list.add(70);
//
//        System.out.println(list);
//        System.out.println(list.add(66));
//        list.set(0,-1);
//        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//
//        //output
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + " ");
//        }

        // 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        // here we are initializing the arraylist,
        // it'll show an error if we directly start adding data to the
        // list because the list is empty for now
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        // add elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list1.get(row).add(sc.nextInt());
            }
        }

        System.out.println(list1);
    }
}
