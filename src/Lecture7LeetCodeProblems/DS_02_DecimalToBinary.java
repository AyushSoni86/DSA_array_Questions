package Lecture7LeetCodeProblems;

public class DS_02_DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        System.out.println(toBinary(decimal));
    }

    static int toBinary(int num) {
        int binary = 0;
        int i = 0;
        while (num != 0) {
            int bit = num % 2;
            binary = binary + bit * (int) Math.pow(10, i++);
            num = num / 2;
        }
        return binary;
    }
}
