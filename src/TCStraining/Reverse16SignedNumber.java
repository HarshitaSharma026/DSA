package TCStraining;

// an employee has an habit of writing numbers in reverse so if he wants to write "12300", he'll write it as "00321".
// his boss got to know about this problem, and he has got a bill made by this employee.
// help the boss to reverse the bill amount with the condiiton that:
//      - print reverse of a number of if it is a 16 bit signed integer.
//      - otherwise print "Wrong value"
//      => 16 bit integer lies between range: [-32,786, 32,767]

public class Reverse16SignedNumber {
    public static void main(String[] args) {
        int n = -1230999990;
        if (reverse(n) < 0) {
            System.out.println("Wrong value");
        }
        else {
            System.out.println(reverse(n));
        }

    }

    static int reverse(int n) {
        int sum = 0;
        boolean isNegative = false;

        if (n >= -32786 && n <= 32767) {
            if (n < 0) {
                isNegative = true;
                n = -(n);
            }

            int len =(int) Math.floor(Math.log10(n) + 1);
            while (n > 0) {
                if (n % 10 != 0) {
                    sum += (n % 10) * Math.pow(10, len - 1);
                }
                n /= 10;
                len -= 1;
            }
            if (isNegative) {
                return -sum;
            }
            return sum;
        }
        return -1;
    }
}
