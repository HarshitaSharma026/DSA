package Recurrsion;

import java.util.ArrayList;

public class FindSubsequences {
    static ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {3,5,6};
        printSubseqList(arr, 0, new ArrayList<>());
//        display subsequences from the arraylist
        for (ArrayList<Integer> inner: outer) {
            System.out.print(inner + " ");
        }
    }

    static void printSubseq(int[] arr, int ind, ArrayList<Integer> list) {
        if (ind >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        printSubseq(arr, ind + 1, list);
        list.remove(list.size() - 1);
        printSubseq(arr, ind + 1, list);
    }


    static void printSubseqList(int[] arr, int ind, ArrayList<Integer> list) {
        if (ind >= arr.length) {
            outer.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[ind]);
        printSubseqList(arr, ind + 1, list);
        list.remove(list.size() - 1);
        printSubseqList(arr, ind + 1, list);
    }
}
