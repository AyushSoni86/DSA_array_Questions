package lecture10LeetCodeProblems;

public class DS_03_findDuplicates {
    public static void main(String[] args) {
        int[] arr =  {6, 3, 1, 5, 4, 6, 2};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i] ^ i;
        }
//        for (int i = 0; i < arr.length; i++) {
//            ans ^= i;
//        }

        return ans;
    }
}
