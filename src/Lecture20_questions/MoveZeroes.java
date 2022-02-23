package Lecture20_questions;

public class MoveZeroes {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12, 0, 12, 0, 54, 0, 10, 0, 0, 99};
        int size = arr.length;
        printArray(arr, size);
        moveZeroes(arr, size);
        printArray(arr, size);
    }

    static void moveZeroes(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
