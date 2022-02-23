package QuestionsTillLec19;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1};
        displayArray(arr);
        sort0and1(arr);
        displayArray(arr);
    }

    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sort0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0/* && left < right*/) {
                left++;
            }
            while (arr[right] == 1 /*&& left < right*/) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
