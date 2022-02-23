package Lecture20_questions;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 1, 2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr1, arr2, arr3);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int n = arr1.length;
        int m = arr2.length;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n)
            arr3[k++] = arr1[i++];

        while (j < m)
            arr3[k++] = arr2[j++];
    }
}
