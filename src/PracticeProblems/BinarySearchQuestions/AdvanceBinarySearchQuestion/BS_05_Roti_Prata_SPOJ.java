package PracticeProblems.BinarySearchQuestions.AdvanceBinarySearchQuestion;

public class BS_05_Roti_Prata_SPOJ {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int ans = rotiPrata(arr, 10);
        System.out.println(ans);
    }

    static int rotiPrata(int[] arr, int paratas) {
        int ans = -1;
        int low = 0;
        int high = 100000000;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, paratas, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int paratas, int mid) {
        int time = 0;
        int parCount = 0;
        for (int i = 0; i < arr.length; i++) {
            time = arr[i];
            int j = 2;
            while (time <= mid) {
                parCount++;
                time += (arr[i] * j);
                j++;
            }
            if (parCount >= paratas) return true;
        }
        return false;
    }

}
