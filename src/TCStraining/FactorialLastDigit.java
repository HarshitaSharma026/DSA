package TCStraining;

// Find factorial of a number and return its last digit
// If the last digit is 0, move on to next digit and print it.
// the catch is you;re not supposed to print 0, print only number present other than 0

public class FactorialLastDigit {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        //find factorial
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
//        System.out.println(fact);

        while (fact > 0) {
            if (fact % 10 != 0) {
                return fact % 10;
            }
            else {
                fact /= 10;
            }
        }
        return 0;
    }
}
