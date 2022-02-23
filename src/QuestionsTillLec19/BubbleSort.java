package QuestionsTillLec19;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,5,6,8,7,6};
        System.out.println("Array before Sorting");
        printArray(arr);
        bubblrSort(arr);
        System.out.println("Array after Sorting");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubblrSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}
