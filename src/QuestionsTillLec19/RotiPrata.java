package QuestionsTillLec19;

import java.util.Scanner;

public class RotiPrata {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int paratha = sc.nextInt();
        int cook = sc.nextInt();
        int[] cooksRank = new int[cook];
        for (int i = 0; i < cooksRank.length; i++) {
            cooksRank[i] = sc.nextInt();
        }
        System.out.println(parathaSpoj(cooksRank,paratha))  ;
    }

    static boolean isPossible(int[] arr, int paratha, int mid) {
        int time = 0;
        int parCount = 0;
        for (int i = 0; i < arr.length; i++) {
            time = arr[i];
            int j = 2;
            while (time <= mid) {
                parCount++;
                time = time + (arr[i] * j);
                j++;
            }
            if (parCount >= paratha) return true;
        }
        return false;
    }

    static int parathaSpoj(int[] arr, int paratha) {
        int ans = -1;
        int low = 0, high = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, paratha, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
