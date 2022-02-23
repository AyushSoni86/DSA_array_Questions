package QuestionsTillLec19;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr1.add(1,2,3,,);
        ArrayList<Integer> duplicates= findIntersection(arr1, arr2);
        System.out.println(duplicates);
    }

    static ArrayList<Integer> findIntersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) == arr2.get(j)) {
                list.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return (ArrayList<Integer>) list;
    }
}
