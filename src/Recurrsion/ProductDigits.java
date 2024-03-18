package Recurrsion;

public class ProductDigits {
    public static void main(String[] args) {
        int n =  505;
        System.out.println(product(n));
    }

    static int product(int n) {
        if (n <= 0) {
            return 1;
        }

        return (n % 10) * product(n / 10);
    }
}
