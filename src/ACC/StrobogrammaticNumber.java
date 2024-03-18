package ACC;

// to find if a number is strobogrammatic number or not

import java.util.HashMap;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        int num = 90;
        System.out.println(checkNumber(num));
    }

    static boolean checkNumber(int num) {
        String str = String.valueOf(num);
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            // if the first character itself is not persent in the map
            if (!map.containsKey(str.charAt(start))) {
                return false;
            }

            // if its present in map then check if this character's value and the character at the last is same
            if (map.get(str.charAt(start)) != str.charAt(end)) {
                return false;
            }
            // if both things work, move forward
            start++;
            end--;

        }
        return true;
    }
}
