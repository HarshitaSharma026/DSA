package Recurrsion;

// PRINT series of n fibonacci number

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("0 1 ");
        fib(0, 1, (num - 2));
        main2();

    }

    // taking the number and printing it in function itself.
    static void fib(int a, int b, int n) {
        // base condition
        if (n == 0) {
            return;
        }

        int sum = a + b;
        System.out.print(sum + " ");
        fib(b, sum, n - 1);
    }

    // different approach to solve the same problem-------------
    // in this approach we are finding fibonacci number at every index, and then printing it
    // calling fib(2), then calling fib(3) and so on, and then printing the number in loop

    static void main2() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for (int i = 0; i < value; i++) {
            System.out.println(fib2(i));
        }
    }

    // thi
    static int fib2(int n) {
        if (n < 2) {
            return n;
        }

        return fib2(n - 1) + fib2(n - 2);
    }
}
