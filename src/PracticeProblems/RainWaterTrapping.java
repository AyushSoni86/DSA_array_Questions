package PracticeProblems;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        System.out.println(water(arr));
        System.out.println(water2(arr));
    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    // Using Extra Space
    static int water(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int trapWater = Math.min(left[i], right[i]);
            ans = ans + trapWater - arr[i];
        }
        return ans;
    }

    // Without Using Space   Optimized solution Two Pointer Approach

    static int water2(int[] arr) {
        int left = 0, right = arr.length - 1;
        int maxLeft = arr[left];
        int maxRight = arr[right];
        int water = 0;
        while(left < right) {
            if (arr[left] < arr[right]) {
                left++;
                maxLeft = Math.max(maxLeft, arr[left]);
                water += maxLeft - arr[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, arr[right]);
                water += maxRight - arr[right];
            }
        }
        return water;
    }
}
