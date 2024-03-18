package Recurrsion.Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baghyaaaad";
//        System.out.println(skip1(str, ""));
        System.out.println(skip2(str));
    }

    // approach 1
    // passing answer string as an argument
    static String skip1(String org, String newstr) {
        if (org.isEmpty()){
            return newstr;
        }

        char ch = org.charAt(0);
        if (ch == 'a') {
            return skip1(org.substring(1), newstr);
        }
        return skip1(org.substring(1), newstr + ch);
    }

    // approach 2
    // taking answer in the function and not passing it as argument
    static String skip2(String org) {
        if (org.isEmpty()){
            return "";
        }

        char ch = org.charAt(0);
        if (ch == 'a') {
            return skip2(org.substring(1));
        }
        else {
            return ch + skip2(org.substring(1));
        }
    }
}
