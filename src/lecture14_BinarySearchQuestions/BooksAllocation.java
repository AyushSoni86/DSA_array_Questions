package lecture14_BinarySearchQuestions;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90, 123, 546, 1, 89};
        int answer = allocateBooks(arr, 2);
        System.out.println(answer);
    }

    static int allocateBooks(int[] arr, int students) {
        int start = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = Integer.MAX_VALUE;
        int end = sum;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, students, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
//            mid = start + (end - start) / 2;
        }

        return ans;
    }

    static boolean isPossible(int[] arr, int student, int mid) {
        int studentCount = 1;
        int pagesCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesCount + arr[i] <= mid)
                pagesCount += arr[i];
            else {
                studentCount++;
                if (studentCount > student || arr[i] > mid)
                    return false;
                pagesCount = arr[i];
            }
        }
        return true;
    }
}
