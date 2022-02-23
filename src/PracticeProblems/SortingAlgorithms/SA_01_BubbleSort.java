package PracticeProblems.SortingAlgorithms;

public class SA_01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 35, 12, 78, 54, 23, 98, 90, 34, 67, 100};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
