package Recurrsion.Leetcode;

// https://leetcode.com/problems/reverse-string/description/

import java.util.ArrayList;

public class ReverseString {
    static ArrayList<Character> list = new ArrayList<>();
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverse(arr, 0);
        System.out.println(list);
    }


    static void reverse(char[] s, int ind) {
        if (ind == s.length) {
            return;
        }

        char ch = s[ind];
        reverse(s, ind+1);
        list.add(ch);
    }
}
