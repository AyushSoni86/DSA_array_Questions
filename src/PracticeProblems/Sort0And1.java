package PracticeProblems;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0};
        printArr(arr);
        sort(arr);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void sort(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (arr[i] == 0 && i < j) i++;
            while (arr[j] == 1 && i < j) j--;
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
