package PracticeProblems.BinarySearchQuestions;

public class BS_05_FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
        System.out.println(sqrt(16));
        System.out.println(sqrt(25));
        System.out.println(sqrt(625));
        System.out.println(sqrt(12325));
    }

    static int sqrt(int num) {
        int low = 0, high = num;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int square = mid * mid;
            if (square == num) return mid;
            if (square < num) {
                ans = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }
}
