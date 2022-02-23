public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 34, 67, 54, 98, 32, 11};
        System.out.println("List before sorting");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("List after sorting");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
