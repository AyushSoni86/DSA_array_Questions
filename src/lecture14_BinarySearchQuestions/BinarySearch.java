package lecture14_BinarySearchQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 12, 23, 32, 34, 54, 67, 98, 100};
        int key = 10, key1 = 12, key2 = 67, key3 = 98;
        System.out.println((binarySearch2(arr, key) != -1) ?
                key + " is present at index " + binarySearch2(arr, key) :
                "Element not present");
        System.out.println((binarySearch2(arr, key1) != -1) ?
                key1 + " is present at index " + binarySearch2(arr, key1) :
                "Element not present");
        System.out.println((binarySearch2(arr, key2) != -1) ?
                key2 + " is present at index " + binarySearch2(arr, key2) :
                "Element not present");
        System.out.println((binarySearch2(arr, key3) != -1) ?
                key3 + " is present at index " + binarySearch2(arr, key3) :
                "Element not present");

    }

    static int binarySearch(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
//        int mid = (i + j) / 2;
        // abb karenge chalaki
        int mid = i + (j - 1) / 2;
        while (i <= j) {
            if (arr[mid] == key) return mid;
            if (key > arr[mid]) i = mid + 1;
            if (key < arr[mid]) j = mid - 1;
            mid = i + (j - 1) / 2;
        }
        return -1;
    }
    static int binarySearch2(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
//        int mid = (i + j) / 2;
        // abb karenge chalaki
        int mid = i + (j - 1) / 2;
        while (i <= j) {
            if (arr[mid] == key) return mid;
            else if (key > arr[mid]) i = mid + 1;
            else if (key < arr[mid]) j = mid - 1;
            mid = i + (j - 1) / 2;
        }
        return -1;
    }
}
