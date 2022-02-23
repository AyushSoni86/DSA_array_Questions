package lecture14_BinarySearchQuestions;

public class DS_Q852_peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,0};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;

        while (low < high) {
            if (arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid;
            mid = low + (high - low) / 2;
        }
        return low;
    }
}
