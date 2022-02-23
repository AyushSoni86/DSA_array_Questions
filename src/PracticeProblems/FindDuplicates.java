package PracticeProblems;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,4,8,7,9,9};
        System.out.println(findDuplicate(arr));
    }


    static int findDuplicate(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
            ans = ans ^ arr[i] ^ i;
        return ans;
    }
}
