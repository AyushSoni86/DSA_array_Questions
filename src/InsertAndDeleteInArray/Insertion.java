package InsertAndDeleteInArray;

public class Insertion {

    public static void main(String[] args) {

        int[] arr = new int[100];

        int size = 9;

        arr[0] = 11;
        arr[1] = 15;
        arr[2] = 18;
        arr[3] = 10;
        arr[4] = 11;
        arr[5] = 13;
        arr[6] = 21;
        arr[7] = 31;
        arr[8] = 41;
       // 11 15 18 10 100 11 13 21 31 41
        printArray(arr, size);
        insertAtIndex(arr, 9, 4,100);
        printArray(arr, 10);
        deletion(arr,size,2);
        printArray(arr, 10);
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertAtIndex(int[] arr, int size, int index, int element) {
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
    }

    static void deletion(int[] arr,int size, int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i+1];
        }
        arr[size] = 0;
    }
}
