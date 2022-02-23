package lecture10LeetCodeProblems;

import java.util.ArrayList;

public class DS_05_twoSum {
    public static void main(String[] args) {
        int[] array = {12,1,12,3,14,16};
        ArrayList<Integer> arrayList = triplet(array, 40);
        System.out.println(arrayList);
    }

    // optimised code n^3
    static ArrayList<Integer> triplet(int[] arr, int target){
        ArrayList<Integer> returningArr = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == target){
                        returningArr.add(arr[i]);
                        returningArr.add(arr[j]);
                        returningArr.add(arr[k]);
                    }
                }
            }
        }
        return returningArr;
    }
}
