package PracticeProblems;

public class StockBuySell_1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 8, 3, 4};
        System.out.println(stockProfit(arr));
        System.out.println(stockProfit2(arr));
        System.out.println(stockProfit3(arr));
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Brute - Force
    static int stockProfit(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    // approach 2 - using space
    static int stockProfit2(int[] arr) {
        int[] aux = new int[arr.length];
        int maxProfit = 0;
        aux[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            aux[i] = Math.min(arr[i], aux[i - 1]);
        }
        for (int i = 0; i < arr.length; i++) {
            int profit = arr[i] - aux[i];
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
    // approach 3 - without using space
    static int stockProfit3(int[] arr) {
        int minSoFar = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
