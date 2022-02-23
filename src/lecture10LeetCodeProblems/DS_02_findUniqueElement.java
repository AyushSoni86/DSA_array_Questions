package lecture10LeetCodeProblems;

public class DS_02_findUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 6, 5, 7, 8, 7, 8};
        System.out.println(uniqueElement(arr));
    }


    static int uniqueElement(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}