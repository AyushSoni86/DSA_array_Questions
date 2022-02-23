package PracticeProblems.BinarySearchQuestions.AdvanceBinarySearchQuestion;

public class BS_04_EKO_EKO_SPOJ {
    public static void main(String[] args) {
        int[] arr = {20,15,10,17};
        int ans = minWood(arr,7);
        System.out.println(ans);
        System.out.println(minWood(new int[]{16, 12, 8, 15},10));
    }

    static int minWood(int[] arr, int wood) {
        int ans = -1;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int low = 0;
        int high = maxi;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, wood, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int wood, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                sum = sum + arr[i] - mid;
            }
        }
        return sum >= wood;


    }
}
