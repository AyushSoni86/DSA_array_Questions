package Lecture21_questins;

import java.util.ArrayList;
import java.util.Collections;

public class AddArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1};
        int[] arr2 = {8, 9};
        ArrayList<Integer> ans;
        ans = addArray(arr1, arr2);
        System.out.println(ans);
    }

    //    static ArrayList<Integer> reverse(ArrayList<Integer> ans){
//        int i = 0, j = ans.size() - 1;
//        while(i < j){
//            int temp = ans.get(i);
//            ans.get(i) = ans.get(j);
//            ans.get(j) = temp;
//        }
//        return ans;
//    }
    static ArrayList<Integer> addArray(int[] arr1, int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }

        while (i >= 0) {
            int sum = arr1[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;

        }
        while (carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }


        Collections.reverse(ans);
        return ans;
    }
}
