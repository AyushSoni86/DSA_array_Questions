package QuestionsTillLec19;

import java.rmi.dgc.VMID;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        int[] arr = {12, 34, 67, 90, 123, 546, 1, 89};
        System.out.println(booksAllocate(arr,2));
    }

    static int booksAllocate(int[] arr, int student) {
        int ans = -1;
        int low = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int high = sum;


        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, student, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int student, int mid) {
        int pageSum = 0;
        int studentCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] <= mid)
                pageSum += arr[i];
            else {
                studentCount++;
                if (studentCount > student || arr[i] > mid)
                    return false;
                pageSum = arr[i];
            }
        }

        return true;
    }
}
