package Lecture7LeetCodeProblems;

public class DS_04_reverseNumber {
    public static void main(String[] args) {
        int num = 1999999999;
        System.out.println(reverseNum(num));
    }

    static int reverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

}
