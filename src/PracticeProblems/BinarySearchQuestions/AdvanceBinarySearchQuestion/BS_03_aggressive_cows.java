package PracticeProblems.BinarySearchQuestions.AdvanceBinarySearchQuestion;

import java.util.Arrays;
import java.util.concurrent.locks.StampedLock;

public class BS_03_aggressive_cows {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 4};
        int ans = aggressiveCows(arr, 3);
        System.out.println(ans);
    }

    static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int ans = -1;
        int low = 0, high = arr[arr.length - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    static boolean isPossible(int[] stalls, int cows, int dist) {
        int cowCount = 1;
        int cowPos = stalls[0];
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] - cowPos >= dist) {
                cowCount++;
                if (cowCount == cows)
                    return true;
                cowPos = stalls[i];
            }
        }

        return false;
    }
}
