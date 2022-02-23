package QuestionsTillLec19;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        printArray(arr);
        int totalWater = rainWatertrapping(arr);
        System.out.println("The water is " + totalWater + " units.");

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int rainWatertrapping(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, water = 0;
        int maxLeft = arr[left];
        int maxRight = arr[right];

        while (left < right) {

            if (arr[left] < arr[right]) {
                left++;
                maxLeft = Math.max(maxLeft, arr[left]);
                water += (maxLeft - arr[left]);
            } else {
                right--;
                maxRight = Math.max(maxRight, arr[right]);
                water += (maxRight - arr[right]);
            }
        }
        return water;
    }
}
