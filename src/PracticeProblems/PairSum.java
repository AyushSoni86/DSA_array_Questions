package PracticeProblems;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayList<ArrayList<Integer>> ans = pairSum(arr, 6);
        System.out.println(ans);
    }

    static ArrayList<ArrayList<Integer>> pairSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                if (arr[i] + arr[j] == k) {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
