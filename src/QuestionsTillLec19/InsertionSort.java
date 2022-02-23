package QuestionsTillLec19;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0,9,8,7,6,5,4,3,2,1};
        printArray(arr);
//        insertionSort(arr);
//        printArray(arr);
        insertionSortByBabbar(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertionSortByBabbar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp)
                    arr[j + 1] = arr[j];
                else
                    break;
            }
            arr[j+1] = temp;
        }


    }

    static void insertionSort(int[] arr) {
        int key, j;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
