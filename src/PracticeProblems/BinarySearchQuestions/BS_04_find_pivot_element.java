package PracticeProblems.BinarySearchQuestions;

public class BS_04_find_pivot_element {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low < high){
            int mid = low +(high - low)/2;
            if (arr[mid] >= arr[0])
                low = mid + 1;
            else
                high = mid;
        }
        return high;
    }
}
