package Recurrsion.Leetcode;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
// find and return the first upper case character from a string

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        String str = "geeks for gees";
        System.out.println(upperLetter(str));
    }

    static char upperLetter(String str) {
        if (str.isEmpty()) {
            return '0';
        }
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch)) {
            return ch;
        }
        return upperLetter(str.substring(1));
    }
}
