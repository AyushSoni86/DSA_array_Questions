package QuestionsTillLec19;

import java.util.ArrayList;
import java.util.Collections;


public class collectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(6);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);
    }
}
