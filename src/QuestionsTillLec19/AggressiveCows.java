package QuestionsTillLec19;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

    }

    static boolean isPossible(int[] arr, int cows, int mid) {
        int cowsCount = 1;
        int lastPos = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                cowsCount++;
                if (cows == cowsCount)
                    return true;
            }
            lastPos = arr[i];
        }
        return false;
    }

    static int aggressiveCows(int[] arr, int cows) {
        int ans = -1;
        int low = 0;
        Arrays.sort(arr);
        int high = arr[arr.length - 1] - arr[0];
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
}
