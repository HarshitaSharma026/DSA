package ArraysAndArraylists;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1789, 4,890, 5067, -1, -2};
        System.out.println(evenDigits(arr));
        System.out.println(findNumbers(arr));
        System.out.println(numberofDigits1(83646834));
    }

    // -------- my solution
    static int evenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int evenCount = 0;
            // counting number of digits
            while (num > 0) {
                evenCount++;
                num /= 10;
            }
            if (evenCount % 2 == 0)
                count++;
        }

        return count;
    }

    // ------- what is shown in the video
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int element: arr) {
            if (numberofDigits(element) % 2 == 0)
                count++;
        }
        return count;
    }

    // ------ finding number of digits
    static int numberofDigits(int num) {
        int count = 0;

        // because if number is -ve its taking it as 2 digits
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // shortcut to find number of digits
    static int numberofDigits1(int num) {
        // because if number is -ve its taking it as 2 digits
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
