package Lecture7LeetCodeProblems;

public class DS_01_BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 11;
        System.out.println(toDecimal(binary));
    }

    static int toDecimal(int num) {
        int decimal = 0;
        int i = 0;
        while (num != 0) {
            int digit = num % 10;
            decimal = decimal + digit * (int) Math.pow(2, i++);
            num = num / 10;
        }
        return decimal;
    }
}
