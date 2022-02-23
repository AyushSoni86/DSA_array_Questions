package QuestionsTillLec19;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,5,6,8,7,6};
        System.out.println("Array before Sorting");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Array after Sorting");
        printArray(arr);
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[indexOfMin] > arr[j]){
                    indexOfMin = j;
                }
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }
}
