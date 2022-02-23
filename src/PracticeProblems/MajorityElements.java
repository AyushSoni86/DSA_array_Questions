package PracticeProblems;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(findElement(arr));
        System.out.println(findMajor(arr));
    }

    // brute - force solution
    static int findElement(int[] arr) {
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        return (maxCount > (arr.length / 2)) ? arr[index] : -1;
    }

    // optimised Solution


    static int findMajor(int[] arr) {
        int count = 1;
        int majElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[majElement]) count++;
            else count--;

            if (count == 0) {
                majElement = i;
                count = 1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[majElement])
                cnt++;
        }
        return (cnt > (arr.length / 2)) ? arr[majElement] : -1;
    }
}
