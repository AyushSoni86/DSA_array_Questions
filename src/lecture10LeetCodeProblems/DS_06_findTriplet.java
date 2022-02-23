package lecture10LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DS_06_findTriplet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 12;
        ArrayList<ArrayList<Integer>> tripleSum = findTriplets(arr,arr.length, sum);
        System.out.println(tripleSum);
    }

    static ArrayList<ArrayList<Integer>> triplet(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> returningArr = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        returningArr.add(temp);
                    }
                }
            }
        }
//        Arrays.sort(returningArr.toArray());
        return returningArr;
    }

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // Sorting the arraylist.
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int target = k - arr[i];
            int front = i + 1;
            int back = n - 1;

            while (front < back) {
                int sum = arr[front] + arr[back];

                // Finding answer which starts from arr[i].
                if (sum < target) {
                    front++;
                } else if (sum > target) {
                    back--;
                } else {
                    int x = arr[front];
                    int y = arr[back];

                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[front]);
                    list.add(arr[back]);
                    ans.add(list);

                    // Incrementing front pointer until we reach a different number.
                    while (front < back && arr[front] == x) {
                        front++;
                    }

                    // Decrementing last pointer until we reach a different number.
                    while (front < back && arr[back] == y) {
                        back--;
                    }
                }
            }
            // Ensuring that we don't encounter duplicate values for arr[i].
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return ans;
    }
}
