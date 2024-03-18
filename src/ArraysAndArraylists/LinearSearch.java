package ArraysAndArraylists;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {25, 14, 78, 9, 0, -1};
        System.out.println(search(arr, 78));
        System.out.println(search2(arr, 78));
        System.out.println(search3(arr, -1));
    }

//    returning the index if the element found
    static int search(int arr[], int target) {
        if (arr.length == 0) {
            System.out.println("Empty array");
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

//    returning the element if the element found
    static int search2(int arr[], int target) {
        if (arr.length == 0) {
            System.out.println("Empty array");
            return -1;
        }

        for(int elem: arr) {
            if (elem == target)
                return elem;
        }
        return -1;
    }

    // search the target and return true or false
    static boolean search3(int arr[], int target) {
        if (arr.length == 0) {
            System.out.println("Empty array");
            return false;
        }

        for(int elem: arr) {
            if (elem == target)
                return true;
        }
        return false;
    }

}


