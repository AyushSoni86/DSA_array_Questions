package QuestionsTillLec19;

public class BubbleSortAdaptive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
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
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            isSorted = false;
//            System.out.println("Pass number -> " + i );
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                System.out.println("comparision no -> " + j);
//                printArray(arr);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted)
                return;

        }
    }
}
