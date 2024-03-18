package Recurrsion.Strings;

import java.util.ArrayList;

public class SubsetPrinting {
    public static void main(String[] args) {
        String  str = "abc";
//        subsequence(" ", str);
//        System.out.println(subsequenceArrayList(" ", str));
//        subsequenceAscii("", str);
        System.out.println(subsequenceAsciiArrayList("", str));
    }

    static void subsequence(String proc, String unproc) {
        if (unproc.isEmpty()) {
            // print the subsequence
            System.out.print(proc + ", ");
            return;
        }

        // if we are taking the chararcter
        char ch = unproc.charAt(0);
        subsequence(proc + ch, unproc.substring(1));
        // if we are ignoring the character
        subsequence(proc, unproc.substring(1));
    }


    // Store it in arraylist and print
    static ArrayList<String> subsequenceArrayList(String proc, String unproc) {
        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        // if we are taking the character
        char ch = unproc.charAt(0);
        ArrayList<String> left = subsequenceArrayList(proc + ch, unproc.substring(1));
        // if we are ignoring the character
        ArrayList<String> right = subsequenceArrayList(proc, unproc.substring(1));
        left.addAll(right);
        return left;
    }


    // printing ASCII values also
    static void subsequenceAscii(String proc, String unproc) {
        if (unproc.isEmpty()) {
            // print the subsequence
            System.out.print(proc + ", ");
            return;
        }

        // if we are taking the chararcter
        char ch = unproc.charAt(0);
        subsequenceAscii(proc + ch, unproc.substring(1));
        // if we are ignoring the character
        subsequenceAscii(proc, unproc.substring(1));
        subsequenceAscii(proc + (ch + 0), unproc.substring(1));

    }

    // ascii array list
    static ArrayList<String> subsequenceAsciiArrayList(String proc, String unproc) {
        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        // if we are taking the character
        char ch = unproc.charAt(0);
        ArrayList<String> left = subsequenceAsciiArrayList(proc + ch, unproc.substring(1));
        // if we are ignoring the character
        ArrayList<String> right = subsequenceAsciiArrayList(proc, unproc.substring(1));
        ArrayList<String> third  = subsequenceAsciiArrayList(proc + (ch + 0), unproc.substring(1));

        left.addAll(right);
        left.addAll(third);
        return left;
    }
}
