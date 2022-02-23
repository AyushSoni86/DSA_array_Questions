package lecture14_BinarySearchQuestions;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {11, 12, 34, 34, 34, 34, 67, 98};
        int startindex = firstOccurence(arr, 34);
        int lastIndex = lastOccurence(arr, 34);
        System.out.println(startindex + " " + lastIndex);
        System.out.println("Total number of occurence of 34 is " + (lastIndex - startindex + 1));
    }

    static int lastOccurence(int[] arr, int key) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (key == arr[mid]) {
                ans = mid;
                low = mid + 1;
            }
            if (key > arr[mid]) low = mid + 1;
            if (key < arr[mid]) high = mid - 1;
            mid = low + (high - low) / 2;
        }
        return ans;
    }

    static int firstOccurence(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        while (start <= end) {
            if (key == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            if (key > arr[mid]) start = mid + 1;
            if (key < arr[mid]) end = mid - 1;
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
