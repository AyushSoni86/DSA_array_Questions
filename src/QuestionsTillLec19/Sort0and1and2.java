package QuestionsTillLec19;

public class Sort0and1and2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0};
        printArray(arr);
        sort012(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sort012(int[] arr){
        int i = 0, j = 0, k = arr.length - 1;

        while(j<=k){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }
            else if (arr[j] == 1){
                j++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }



    }
    static void sort0and1and2(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }
}