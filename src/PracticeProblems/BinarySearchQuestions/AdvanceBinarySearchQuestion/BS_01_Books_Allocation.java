package PracticeProblems.BinarySearchQuestions.AdvanceBinarySearchQuestion;

public class BS_01_Books_Allocation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int ans = allocateBooks(arr, 2);
        System.out.println(ans);
    }

    static int allocateBooks(int[] arr, int students) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = -1;
        int low = 0;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, students, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int students, int mid) {
        int pagesCount = 0;
        int stdCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (pagesCount + arr[i] <= mid) {
                pagesCount += arr[i];
            } else {
                stdCount++;
                if (stdCount > students || arr[i] > mid)
                    return false;
                pagesCount = arr[i];
            }
        }
        return true;
    }

}

