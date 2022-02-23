package PracticeProblems.SortingAlgorithms;

public class SA_03_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {12, 35, 12, 78, 54, 23, 98, 90, 34, 67, 100};
        print(arr);
        selectionSort(arr);
        print(arr);

    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        int indexOfMin, temp;
        for (int i = 0; i < arr.length; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexOfMin] > arr[j])
                    indexOfMin = j;
            }
            temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
}
