package Lecture20_questions;

public class CheckSortesOrRotated {
    public static void main(String[] args) {
        int[] arr = {10,12, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(check(arr));
    }

    static boolean check(int[] arr) {
        int count = 0, n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (arr[n - 1] > arr[0])
            count++;

        return count <= 1;
    }
}
