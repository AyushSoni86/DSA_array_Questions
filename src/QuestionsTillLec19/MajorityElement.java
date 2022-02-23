package QuestionsTillLec19;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        printMajority(arr);

    }


//    Using Moore’s Voting Algorithm

    static void printMajority(int[] arr) {
        int element = findElement(arr);
        System.out.println((isMajority(arr, element)) ?
                "Majority element is : " + element :
                "No majority Element");
    }

    static int findElement(int[] arr) {
        int ansIndex = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[ansIndex]) count++;
            else count--;

            if (count == 0) {
                ansIndex = i;
                count = 1;
            }
        }

        return arr[ansIndex];
    }

    static boolean isMajority(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) count++;
        }
        if (count > (arr.length / 2)) return true;
        return false;
    }
}
