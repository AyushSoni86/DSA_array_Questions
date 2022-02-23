package PracticeProblems;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 8};
        int[] arr2 = {2, 4, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr1, arr2, arr3);
        print(arr1);
        print(arr2);
        print(arr3);
    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int m = arr1.length, n = arr2.length, o = arr3.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < m) arr3[k++] = arr1[i++];
        while (j < n) arr3[k++] = arr2[j++];
    }
}
