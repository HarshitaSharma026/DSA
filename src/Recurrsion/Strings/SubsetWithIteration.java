package Recurrsion.Strings;


// NOT UNDERSTOOD --

import java.util.ArrayList;
import java.util.List;

public class SubsetWithIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                // the number of times the outer list size is,
                // that many times a new list will be created
                List<Integer> inner = new ArrayList<>(outer.get(i))  ;
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}
