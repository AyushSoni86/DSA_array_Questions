package PracticeProblems.BinarySearchQuestions;

public class BS_01_left_And_Right_Occurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 3, 4, 5, 6};
        System.out.println(leftOccurence(arr, 3));
        System.out.println(rightOcurence(arr, 3));
    }

    static int leftOccurence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                ans = mid;
                high = mid - 1;
            }
            else if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    static int rightOcurence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                ans = mid;
                low = mid + 1;
            }
            else if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }
}
