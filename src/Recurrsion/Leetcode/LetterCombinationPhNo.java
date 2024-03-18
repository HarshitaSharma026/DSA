package Recurrsion.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCombinationPhNo {
    public static void main(String[] args) {
        String str = "78";
        System.out.println(combinations("",str));
        System.out.println(combinationsCount("", str));
    }

    // passing answers in array list
    static ArrayList<String> combinations(String proc, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        // convert the number into digit(int)
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinations(proc + ch, up.substring(1)));
        }
        return ans;
    }

    // counting number of permutations
    static int combinationsCount(String proc, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        // convert the number into digit(int)
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            count = count + combinationsCount(proc + ch, up.substring(1));
        }
        return count;
    }
}
