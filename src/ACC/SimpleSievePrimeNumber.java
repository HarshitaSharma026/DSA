package ACC;

public class SimpleSievePrimeNumber {
    public static void main(String[] args) {
        int num = 121;
//        System.out.println(primeBrute(num));
        simpleSieve(40);
    }

    // BRUTE FORCE
    static boolean primeBrute(int  num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void simpleSieve(int num) {
        boolean[] arr = new boolean[num + 1];
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= num; j += i) {
                    arr[j] = true;
                }
            }
        }

        // printing the final prime numbers
        for (int i = 2; i <= num; i++) {
            if (!arr[i]) {
                System.out.print(i + ", ");
            }
        }
    }
}
