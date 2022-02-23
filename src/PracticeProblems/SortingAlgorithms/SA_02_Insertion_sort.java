package PracticeProblems.SortingAlgorithms;

public class SA_02_Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {12, 35, 12, 78, 54, 23, 98, 90, 34, 67, 100};
        print(arr);
        insertionSort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void insertionSort(int []arr){
        int key, j;
        for (int i = 1 ; i < arr.length; i++) {
            key = arr[i];
            j = i-1;
            while(key < arr[j] && j >= 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }


    }
}
