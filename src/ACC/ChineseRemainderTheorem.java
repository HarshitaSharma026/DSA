package ACC;

import java.util.Scanner;

public class ChineseRemainderTheorem {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter divisor: ");
//        int size = sc.nextInt();
//        int[] div = new int[size];
//        for (int i = 0; i < size; i++) {
//            div[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter remainder: ");
//        int[] rem = new int[size];
//        for (int i = 0; i < size; i++) {
//            rem[i] = sc.nextInt();
//        }
        int[] num = {5,7};
        int[] rem = {1,3};
        System.out.println(calculate(2, num, rem));
    }

    static int calculate(int size, int[] div, int[] rem) {
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < size;j++) {
                if (x % div[j] != rem[j])
                    break;
            }
            if (j == size)
                return x;
            x++;
        }
    }
}
