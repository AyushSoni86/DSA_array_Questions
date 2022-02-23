package lecture10LeetCodeProblems;

import java.util.ArrayList;

public class DS_04_ArrayIntersection {
    public static void main(String[] args) {
       int [] arr1 = { 1, 2, 2, 2, 3, 4};
        int [] arr2 = {2, 2, 3, 3};
//        int [] arr3 = intersection(arr1,arr2);
    }
    static ArrayList<Integer> intersection(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> ans = null;
        int i = 0, j = 0;
        while(i < arr1.size() && j < arr2.size()){
            if (arr1.get(i) < arr2.get(j)){
                i++;
            }
            else if(arr1.get(i) == arr2.get(j)){
                ans.add(arr1.get(i));
                i++;j++;
            }
            else{
                j++;
            }
        }


        return ans;
    }
}
