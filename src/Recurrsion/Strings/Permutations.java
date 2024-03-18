package Recurrsion.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutationsCount("", "ac"));
    }


    // printing all the permuattions
    static void permutations(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        for (int i = 0; i <= proc.length(); i++) {
            String first = proc.substring(0, i);
            String last = proc.substring(i, proc.length());
            permutations(first + ch + last, unproc.substring(1));

        }
    }


    // adding all permutations in an arraylist and pass it
    static ArrayList<String> permutationsArrayList(String proc, String unproc) {

        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        // local to this call
        ArrayList<String> ans = new ArrayList<>();
        char ch = unproc.charAt(0);
        for (int i = 0; i <= proc.length(); i++) {
            String first = proc.substring(0, i);
            String last = proc.substring(i, proc.length());
            ans.addAll(permutationsArrayList(first + ch + last, unproc.substring(1)));
        }
        return ans;
    }

    // counting number of permutations
    static int permutationsCount(String proc, String unproc) {
        if (unproc.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unproc.charAt(0);
        for (int i = 0; i <= proc.length(); i++) {
            String first = proc.substring(0, i);
            String last = proc.substring(i, proc.length());
            count = count + permutationsCount(first + ch + last, unproc.substring(1));

        }
        return count;
    }
}
