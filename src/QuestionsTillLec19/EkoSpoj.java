package QuestionsTillLec19;

import java.util.*;
import java.lang.*;

public class EkoSpoj {


    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int trees = input.nextInt();
        int requirsWood = input.nextInt();

        int[] arr = new int[trees];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(eko(arr, requirsWood));
    }

    static boolean isPossible(int[] arr, int m, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                sum = sum + arr[i] - mid;
            }

        }
        if (sum >= m) return true;
        return false;
    }

    static int eko(int arr[], int m) {
        int low = 0, ans = -1, maxi = -1;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(arr[i], maxi);
        }
        int high = maxi;

       while(low <= high){
           int mid = low + (high - low )/2;

           if (isPossible(arr,m,mid)){
               ans = mid;
               low = mid + 1;
           }else
               high = mid - 1;
       }
        return ans;
    }
}

