package PracticeProblems.BinarySearchQuestions.AdvanceBinarySearchQuestion;


public class BS_02_PaintersPArtition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ans = paintersPartition(arr, 3);
        System.out.println(ans);
    }

    static int paintersPartition(int[] arr, int painter) {
        int low = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = -1;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, painter, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    static boolean isPossible(int[] board, int painter, int mid) {
        int boardCount = 0;
        int paintersCount = 1;
        for (int i = 0; i < board.length; i++) {
            if (boardCount + board[i] <= mid) {
                boardCount += board[i];
            } else {
                paintersCount++;
                if (paintersCount > painter || board[i] > mid)
                    return false;
                boardCount = board[i];

            }
        }
        return true;
    }
}
