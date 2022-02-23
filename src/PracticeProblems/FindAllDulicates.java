package PracticeProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAllDulicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,3,2,1,5};
        ArrayList<Integer> ans = findALlDuplicates(arr);
        System.out.println(ans );
    }

    static ArrayList<Integer> findALlDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n  = Math.abs(arr[i]);
            if (arr[n-1] > 0)
                arr[n-1] *= -1;
            else
                ans.add(arr[i]);
        }
        return ans;
    }
}
