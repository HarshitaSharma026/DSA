package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n = 20;
//        System.out.println(20 / 2);
//        System.out.println(2 / 20);
        ArrayList<Integer> ans = factors2(n);
        Collections.sort(ans);
        System.out.println(ans);
    }

    // brute force to find number of factors
    // O(n)
    static ArrayList<Integer> factors1(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    // here we'll check only till sqrt(n) beacuse after this
    // values are getting repeated
    // O(sqrt(n))
    static ArrayList<Integer> factors2(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // in case n = 36
                    // 36 % 6 => 6 will be added, and 36/6 = 6 will be added again
                    // that's why we are mainting this check
                    list.add(i);
                }
                else {
                    list.add(i);    // 20 % 2 = 10 * 2, 2 is answer
                    list.add(n / i);  // 20 / 2 = 10, 10 is another answer
                    // so here we'll be getting two factors of n
                }

            }
        }
        return list;
    }

}
