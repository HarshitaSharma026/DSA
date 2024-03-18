package ArraysAndArraylists.BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'm'));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

//         if target is greater than the largest character in the array
//        if (target > letters[letters.length - 1])
//            return letters[0];

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else if (letters[mid] < target) {
                start = mid + 1;
            }
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
        // start % letters.length: different way to write the above commented if statment
        // if start = 2, then 2 % N = 2 and 4 % N(4) = 0 (the first value itself)
    }
}
