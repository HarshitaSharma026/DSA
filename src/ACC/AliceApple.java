package ACC;

import java.util.Scanner;

public class AliceApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of apples: ");
        int m = sc.nextInt();
        System.out.println("enter no of apples in each tree: ");
        int k = sc.nextInt();
        System.out.println("enter no of trees in north: ");
        int n = sc.nextInt();
        System.out.println("enter no of trees in south: ");
        int s = sc.nextInt();
        System.out.println("enter no of trees in west: ");
        int w = sc.nextInt();
        System.out.println("enter no of trees in east: ");
        int e = sc.nextInt();
        int ans = minApples(m, k, n, s, w, e);
        System.out.println(ans);
    }

    static int minApples(int m, int k, int n, int s, int e, int w) {
        if (m <= s * k) {
            return m;
        }
        else if (m <= s * k + e + w) {
            return s * k + (m - s * k);
        }
        else {
            return -1;
        }
    }
}
