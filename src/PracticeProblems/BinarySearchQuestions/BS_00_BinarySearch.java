package PracticeProblems.BinarySearchQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BS_00_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {98, 3, 12, 43, 56, 77, 7, 9, 38, 79, 76, 5, 93};
        int[] arr2 = {3, 5, 7, 9, 12, 38, 43, 56, 76, 77, 79, 93, 98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr2));
        System.out.println(binarySearch(arr2,76));
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
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
