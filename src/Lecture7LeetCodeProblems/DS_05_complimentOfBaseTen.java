package Lecture7LeetCodeProblems;

public class DS_05_complimentOfBaseTen {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(compliment(num));
    }

    static int compliment(int num) {
        if (num == 0) return 1;
        int temp = num;
        int mask = 0;
        while (temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        int result = mask & (~num);
        return result;
    }
}
