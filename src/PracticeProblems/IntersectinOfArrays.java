package PracticeProblems;

import java.util.ArrayList;

public class IntersectinOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 9, 10};
        int[] arr2 = {2, 3, 4, 5, 10};
        ArrayList<Integer> ans;
        ans = intersection(arr1, arr2);
        System.out.println(ans);
    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> arr3 = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arr3.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) i++;
            else j++;
        }
        return arr3;
    }
}
