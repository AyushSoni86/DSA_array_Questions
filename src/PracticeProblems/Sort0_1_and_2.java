package PracticeProblems;

public class Sort0_1_and_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 0, 2, 2, 0, 1, 0, 1, 2, 1, 0, 1, 2, 0};
        printArr(arr);
        sort1(arr);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void sort1(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low++] = arr[mid];
                    arr[mid++] = temp;
//                    low++;
//                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high--] = arr[mid];
                    arr[mid] = temp;
                    break;
            }
        }
    }
}
