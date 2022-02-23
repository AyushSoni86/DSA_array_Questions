package PracticeProblems;

public class SearchIn_Infinite_sorted_Array {
    public static void main(String[] args) {

    }

    static int search(int[] arr, int key) {
        int low = 0, high = 1;
        while (key > arr[high]) {
            low = high;
            high = high * 2;
        }
        return binarySearch(arr, low, high, key);
    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            if (key > arr[mid]) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }
}
