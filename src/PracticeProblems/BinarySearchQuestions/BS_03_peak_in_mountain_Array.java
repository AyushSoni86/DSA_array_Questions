package PracticeProblems.BinarySearchQuestions;

public class BS_03_peak_in_mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 9, 13, 2};
        System.out.println(peakElement(arr));
    }

    static int peakElement(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid ;
        }
        return high;
    }
}
