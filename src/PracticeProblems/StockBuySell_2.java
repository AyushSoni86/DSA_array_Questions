package PracticeProblems;

public class StockBuySell_2 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,6,1,2,4};
        System.out.println(maximixeProfit(arr));
    }

    static int maximixeProfit(int[] arr) {
        int profit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                profit += (arr[i + 1] - arr[i]);
            }
        }
        return profit;
    }
}
